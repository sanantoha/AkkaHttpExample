package com.edu.webservice.algebra

import com.edu.webservice.domain.User

import scala.concurrent.Future

trait UserRepository {

  def find(name: String): Future[Option[User]]
}
