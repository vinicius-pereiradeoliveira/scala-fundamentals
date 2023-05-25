ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "rest-api-postgres",

    libraryDependencies ++= Seq(
      // akka http dependencies
      "com.typesafe.akka" %% "akka-http" % "10.5.0",
      "com.typesafe.akka" %% "akka-http-spray-json" % "10.5.0",
      "com.typesafe.akka" %% "akka-stream" % "2.8.0",

      // slick and database dependencies
      "com.typesafe.slick" %% "slick" % "3.4.1",
      "org.postgresql" % "postgresql" % "42.5.4",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.4.1",
      "org.liquibase" % "liquibase-sbt" % "3.10.1",

      // json dependencies
      "io.spray" %% "spray-json" % "1.3.6",
    )

  )
