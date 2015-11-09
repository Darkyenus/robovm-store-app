iOSRoboVMSettings

name := "robovm-store-app"

robovmConfiguration := Left(baseDirectory.value / "robovm.xml")

robovmProperties := Left(baseDirectory.value / "robovm.properties")

libraryDependencies ++= Seq(
	"org.robovm" % "robovm-rt" % RoboVMVersion,
	"org.robovm" % "robovm-cocoatouch" % RoboVMVersion
)

libraryDependencies in Test += "junit" % "junit" % "4.12"
