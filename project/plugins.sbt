val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.2.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.19.0")

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.3")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.14")

