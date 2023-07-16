
plugins {
    id("java")
    id("jacoco")
    id("org.sonarqube") version "4.2.1.3168"
}

group = "com.arun"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // https://mvnrepository.com/artifact/com.amazonaws/aws-lambda-java-core
    implementation("com.amazonaws:aws-lambda-java-core:1.2.2")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}