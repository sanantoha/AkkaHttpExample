name := "AkkaHttpExample"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "1.6.0",

  "com.typesafe.akka" %% "akka-http" % "10.1.7",

  "com.typesafe.akka" %% "akka-stream" % "2.5.20",

  "com.softwaremill.sttp" %% "core" % "1.5.8",
  
  "com.typesafe.slick" %% "slick" % "3.3.0",
  "org.postgresql" % "postgresql" % "42.2.5",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.0",

  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.7" % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.20" % Test
)