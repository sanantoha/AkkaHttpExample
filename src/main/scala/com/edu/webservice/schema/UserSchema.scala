package com.edu.webservice.schema

import java.sql.Timestamp
import java.time.LocalDateTime

import com.edu.webservice.domain.User
import slick.lifted.Tag
import slick.jdbc.PostgresProfile.api._

object UserSchema {

  implicit val localDateTimeType =
    MappedColumnType.base[LocalDateTime, Timestamp](Timestamp.valueOf, _.toLocalDateTime)

  class UserTable(tag: Tag) extends Table[User](tag, "users") {

    def name = column[String]("name", O.PrimaryKey)

    def age = column[Int]("age")

    def lastUpdatetime = column[LocalDateTime]("last_updatetime")

    override def * = (name, age.?, lastUpdatetime.?).mapTo[User]
  }

  lazy val usersTableQuery = TableQuery[UserTable]

}
