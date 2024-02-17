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
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")



}

tasks.named<Test>("test") {

    useJUnitPlatform()

    maxHeapSize = "1G"

    testLogging {
        events("passed")
    }
}
