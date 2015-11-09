lazy val shared = Seq(
  version := "1.0",
  javacOptions ++= Seq(
    "-Xlint",
    "-encoding", "UTF-8",
    "-source", "1.8",
    "-target", "1.8"
  ),
  autoScalaLibrary := false,
  libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
)

lazy val core = project in file("core") settings(shared:_*)

lazy val ios = project in file("ios") dependsOn core settings(shared:_*)

lazy val android = project in file("android") dependsOn core settings(shared:_*)