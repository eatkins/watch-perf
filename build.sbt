//scalaSource in Compile := baseDirectory.value / "src"
val millTest = project
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    //libraryDependencies += "org.scala-sbt" %% "io" % "1.1.6-SNAPSHOT"
  )
