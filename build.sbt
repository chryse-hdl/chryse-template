ThisBuild / scalaVersion         := "2.13.14"
ThisBuild / version              := "0.1.0-SNAPSHOT"
ThisBuild / versionScheme        := Some("early-semver")
ThisBuild / homepage             := Some(url("https://example.com/newproject"))
ThisBuild / organization         := "com.example"
ThisBuild / organizationHomepage := Some(url("https://example.com"))

val chiselVersion = "6.4.0"

lazy val root = (project in file("."))
  .settings(
    name := "newproject",
    libraryDependencies ++= Seq(
      "org.chipsalliance" %% "chisel"    % chiselVersion,
      "org.scalatest"     %% "scalatest" % "3.2.18" % "test",
      "ee.hrzn"           %% "chryse"    % "0.1.1-SNAPSHOT",
    ),
    scalacOptions ++= Seq(
      "-language:reflectiveCalls", "-deprecation", "-feature", "-Xcheckinit",
      "-Ymacro-annotations", "-Xlint",
    ),
    addCompilerPlugin(
      "org.chipsalliance" % "chisel-plugin" % chiselVersion cross CrossVersion.full,
    ),
  )
