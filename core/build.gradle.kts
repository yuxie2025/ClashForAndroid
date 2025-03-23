plugins {
    kotlin("android")
    id("com.android.library")
    id("kotlinx-serialization")
}

android {
    sourceSets["main"].jniLibs.srcDir("libs")
}

dependencies {
    implementation(project(":common"))

    implementation(libs.androidx.core)
    implementation(libs.kotlin.coroutine)
    implementation(libs.kotlin.serialization.json)
}