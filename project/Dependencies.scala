import sbt._

object Dependencies {

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"
  lazy val akkaActorTyped = "com.typesafe.akka" %% "akka-actor-typed" % "2.6.3"
  lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % "10.1.11"
  lazy val akkaStream = "com.typesafe.akka" %% "akka-stream" % "2.6.3"
  lazy val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"

}