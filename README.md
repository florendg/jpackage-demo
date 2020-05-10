##JavaFX jpackage Demo

This project demonstrates how we can build a modular javafx application
and package it using the jpackage tool available with Java 14
To build the installer:

```
./gradlew build

jpackage --module-path build/libs/ --module dev.weirdcat.jpackage.main/dev.weirdcat.jpackage.Hello
```
