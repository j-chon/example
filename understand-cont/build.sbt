import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.tiqwab",
      scalaVersion := "2.12.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "understand-cont",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      scalaz
    )
  )
