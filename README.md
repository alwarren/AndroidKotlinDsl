Android Kotlin-DSL
==================

This project, originally created from a basic empty Android project, was 
converted to use Kotlin DSL in the build system.

In addition to using Kotlin in the build files, it also uses a `buildSrc` 
directory for organizing dependencies and versions.

> "Gradle checks for the existence of a directory called _buildSrc_.
Gradle then automatically compiles and tests this code and puts it in the 
classpath of your build script."

The classes, methods, and properties in _buildSrc_ are available
throughout the project's build files.

**Development Environment:**

* Gradle 4.10.1
* Android Gradle Plugin 3.3.0
* Kotlin 1.3.21
* Android Studio 3.3
