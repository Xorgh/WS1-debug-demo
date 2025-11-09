
plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // or 21 if you prefer
    }
}

tasks.test {
    useJUnitPlatform()
}
