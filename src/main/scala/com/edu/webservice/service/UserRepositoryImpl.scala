package com.edu.webservice.service

import com.edu.webservice.algebra.UserRepository
import com.edu.webservice.domain.User
import slick.jdbc.PostgresProfile.api._
import com.edu.webservice.schema.UserSchema._

import scala.concurrent.{ExecutionContext, Future}

class UserRepositoryImpl(val db: Database)(implicit executor: ExecutionContext) extends UserRepository {

  override def find(name: String): Future[Option[User]] =
    db.run(usersTableQuery.filter(_.name === name).result).map(_.headOption)

}
