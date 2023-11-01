plugins {
    kotlin("jvm") version "1.8.0"
}

group = "com.github.minsoozz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompileOnly("org.junit.jupiter:junit-jupiter-params:5.10.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}