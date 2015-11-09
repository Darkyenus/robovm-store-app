import com.google.common.base.Charsets
import com.google.common.io.Files
import scala.collection.convert.wrapAll._

androidBuild

libraryDependencies += "com.android.support" % "appcompat-v7" % "23+"

val AndroidTarget = "23"

platformTarget in Android := s"android-$AndroidTarget"

//buildToolsVersion in Android := Some("23.0.1") //Remove for latest

proguardOptions in Android ++= Files.readLines(baseDirectory.value / "proguard-rules.pro", Charsets.UTF_8).toSeq

retrolambdaEnabled in Android := true

packagingOptions in Android := PackagingOptions(excludes = Seq("META-INF/LICENSE.txt", "META-INF/NOTICE.txt"))

applicationId in Android := "org.robovm.store"

minSdkVersion in Android := "16"

targetSdkVersion in Android := AndroidTarget

versionCode in Android := Some(1)
