import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val commonSettings = Seq(
  scalacOptions ++= "-deprecation" :: "-feature" :: "-Xlint" :: Nil,
  scalacOptions in (Compile, console) ~= {_.filterNot(_ == "-Xlint")},
  scalafmtOnCompile := true
)

lazy val root = (project in file("."))
  .settings(
    name := "erastiCounter",
    commonSettings,
    libraryDependencies ++= Seq(
      akkaActorTyped,
      akkaStream,
      akkaHttpSprayJson,
      logback,
      scalaTest % Test,
      akkaStreamTestkit % Test,
      akkaHttpTestkit % Test,
      scalaTestJsonAssert % Test
    )
  )
