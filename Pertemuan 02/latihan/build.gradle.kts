plugins {
    kotlin("jvm") version "2.4.20" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        "implementation"("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    }

    apply(plugin = "application")

    configure<JavaApplication> {
        val defaultMain = if (project.name.endsWith("-solusi")) "SolusiKt" else "LatihanKt"
        mainClass.set(defaultMain)
    }

    configure<org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension> {
        jvmToolchain(17)
    }
}
