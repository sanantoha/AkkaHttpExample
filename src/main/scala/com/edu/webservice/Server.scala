package com.edu.webservice

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.edu.webservice.service.UserRepositoryImpl
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Await
import scala.concurrent.duration._

object Server extends App {

  implicit val actorSystem = ActorSystem()
  implicit val materialier = ActorMaterializer()
  implicit val ec = actorSystem.dispatcher

  val db = Database.forConfig("db")
  val userRepository = new UserRepositoryImpl(db)
  try {
    val res = Await.result(userRepository.find("Ivan"), Duration.Inf)
    println(res)
  } catch {
    case e: Exception => println(e)
  } finally {
    db.close()
  }

}
