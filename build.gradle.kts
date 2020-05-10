plugins {
    java
    id("org.openjfx.javafxplugin") version "0.0.8"
}

repositories {
    mavenCentral()
}

tasks {

    java {
        modularity.inferModulePath.set(true)
    }
    test {
        useJUnitPlatform()
    }
    register("copyDependencies", Copy::class) {
        from(configurations.compileClasspath)
        into("build/libs")
    }
}

val build by tasks.existing {
    dependsOn("copyDependencies")
}

javafx {
    version = "14"
    modules("javafx.controls")
}
