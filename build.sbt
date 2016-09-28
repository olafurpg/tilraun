name := "hello-semantic"

version := "0.1.0-SNAPSHOT"

resolvers +=
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

addCompilerPlugin("org.scalameta" % "paradise_2.11.8" % "4.0.0-SNAPSHOT")

scalaVersion := "2.11.8"

libraryDependencies += "org.scalameta" %% "scalameta" % "2.0.0-SNAPSHOT"