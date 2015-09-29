# fjrs

Functional Java Rosetta Stone, implements conversions between types of popular FP-style libraries for Java.

## Changelog

### 0.0.1

First conversions between Functional Java, RxJava and TotallyLazy functions.

## Install

Artifacts can be found on [JitPack](https://jitpack.io/#manuelp/fjrs). [Basically](https://jitpack.io/docs/), 
you just need to add JitPack repo and add the dependency. Using [Gradle](http://gradle.org/) as an example:

```groovy
allprojects {
  repositories { 
    jcenter()
      maven { url "https://jitpack.io" }
  }
}

dependencies {
  compile 'com.github.manuelp:fjrs:[VERSION]'
}
```
