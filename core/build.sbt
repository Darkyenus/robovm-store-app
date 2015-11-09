libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.3",
  "commons-io" % "commons-io" % "2.4",
  "com.squareup.retrofit" % "retrofit" % "2.0.0-beta2",
  "com.squareup.retrofit" % "converter-gson" % "2.0.0-beta2",
  "com.google.code.gson" % "gson" % "2.3.1",

  "org.hamcrest" % "hamcrest-all" % "1.3" % Test,
  "junit" % "junit" % "4.11" % Test
)

exportJars := true //For android backend