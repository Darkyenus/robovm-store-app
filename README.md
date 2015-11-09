# robovm-store-app

## How to use with SBT

Install [sbt](http://www.scala-sbt.org) (sbt is not distributed in wrapper form)
and then run following commands in this directory:
```
sbt ios/device              # Will run the app on connected iOS device
sbt ios/iphoneSim           # Will run the app on iPhone simulator
sbt android/android:run     # Will run the app on connected Android device
```

For more info see:
- [Scala Build Tool](http://www.scala-sbt.org/documentation.html)
- [RoboVM SBT Plugin](https://github.com/roboscala/sbt-robovm)
- [Android SBT Plugin](https://github.com/pfn/android-sdk-plugin)

NOTE: RoboVM plugin 1.9.0 is not yet released into the repositories,
so you will have to compile it yourself and publish it locally. [How is described here.](https://github.com/roboscala/sbt-robovm#hacking-on-the-plugin)
