@Suppress("unused")
object Deps {
    const val gradleAndroid = "com.android.tools.build:gradle:${Versions.gradleAndroid}"
    const val gradleKotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val kotlinCore = "androidx.core:core-ktx:${Versions.kotlinCore}"

    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}

@Suppress("unused")
object Versions {
    // Sdk and tools
    const val compileSdk = 28
    const val minSdk = 19
    const val targetSdk = 28
    const val applicationId = "com.kotlindsl.project"
    const val versionCode = 1
    const val versionName = "1.0"

    // Gradle
    const val gradleAndroid = "3.3.0"

    // Android
    const val appcompat = "1.0.0-beta01"
    const val constraintlayout = "1.1.2"

    // Kotlin
    const val kotlin = "1.3.21"
    const val kotlinCore = "1.1.0-alpha05"

    // Testing
    const val junit4 = "4.12"
    const val testRunner = "1.1.0-alpha4"
    const val espressoCore = "3.1.0-alpha4"
    const val instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

}