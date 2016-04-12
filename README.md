Gradle-plugin 
======================
[![Build Status](https://travis-ci.org/vicfran/gradle-plugin.svg?branch=master)](https://travis-ci.org/vicfran/gradle-plugin)

This repo is thought as a Gradle plugins repository. Trying to dive deep inside Gradle fundamentals.

###How to use it
```
gradle build uploadArchives
```

JAR file with the plugin will be stored at a Maven repo at :
```
../repo/org/gradle/GreetingTestPlugin/
```

To use the plugin, just include in the build.gradle file of your project:

```
buildscript {
 repositories {
  maven {
   url uri('../repo')
  }
 }
 dependencies {
  classpath group: 'org.gradle', name: 'GradleTestPlugin', version: '1.0-SNAPSHOT'
 }
}

apply plugin : 'org.samples.test'
```
