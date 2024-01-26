plugins {
    java
}

group = "com.exercise"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
}

tasks.withType<Test> {
    useJUnitPlatform()
}
