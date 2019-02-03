package com.edu.webservice.domain

import java.time.LocalDateTime
import cats.syntax.option._

final case class User(name: String, age: Option[Int] = none, lastUpdatetime: Option[LocalDateTime] = none)
