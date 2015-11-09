# robovm-store-app

## How to use with SBT

Install [sbt](http://www.scala-sbt.org) (sbt is not distributed in wrapper form)
and then run following commands in this directory:
```
sbt ios/device              # Will run the app on connected iOS device
sbt ios/iphoneSim           # Will run the app on iPhone simulator
sbt android/android:run     # Will run the app on connected Android device
```

If you want to use Scala, remove `autoScalaLibrary := false,` in build.sbt so the Scala's runtime library is included.
You will also have to put Scala sources to `src/main/scala` instead of `src/main/java`.

For more info see:
- [Scala Build Tool](http://www.scala-sbt.org/documentation.html)
- [RoboVM SBT Plugin](https://github.com/roboscala/sbt-robovm)
- [Android SBT Plugin](https://github.com/pfn/android-sdk-plugin)
