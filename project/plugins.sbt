scalaVersion := "2.12.12"

Seq(
  "com.malliina" %% "sbt-utils-maven" % "1.0.0",
  "ch.epfl.scala" % "sbt-bloop" % "1.4.6",
  "org.scalameta" % "sbt-scalafmt" % "2.4.2",
  "io.spray" % "sbt-revolver" % "0.9.1",
  "com.typesafe.sbt" % "sbt-native-packager" % "1.7.5",
  "com.eed3si9n" % "sbt-buildinfo" % "0.10.0"
) map addSbtPlugin
