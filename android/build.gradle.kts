plugins {
    id("com.android.library") version "9.0.0"
    id("org.jetbrains.kotlin.android") version "2.1.0"
}

group = "com.example.android_battery_optimizations"
version = "1.0-SNAPSHOT"

android {
    namespace = "com.example.android_battery_optimizations"
    compileSdk = flutter.compileSdkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        compilerOptions {
            jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
        }
    }

    defaultConfig {
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
    }

    dependencies {
        testImplementation("org.jetbrains.kotlin:kotlin-test")
        testImplementation("org.mockito:mockito-core:5.0.0")
        implementation("androidx.core:core-ktx:1.13.1")
    }
}
