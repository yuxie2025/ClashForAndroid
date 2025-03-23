plugins {
    kotlin("android")
    id("kotlinx-serialization")
    id("com.android.library")
    id("com.google.devtools.ksp")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))
    implementation(project(":core"))
    implementation(project(":common"))

    ksp(libs.androidx.room.compiler)
    ksp(files("libs/kaidl-1.15.jar"))

    implementation(libs.kotlin.coroutine)
    implementation(libs.kotlin.serialization.json)
    implementation(libs.androidx.core)
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    implementation(libs.rikkax.multiprocess)
    implementation(files("libs/kaidl-runtime-1.15.jar"))
}

afterEvaluate {
    android {
        libraryVariants.forEach {
            sourceSets[it.name].kotlin.srcDir(buildDir.resolve("generated/ksp/${it.name}/kotlin"))
            sourceSets[it.name].java.srcDir(buildDir.resolve("generated/ksp/${it.name}/java"))
        }
    }
}