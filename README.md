Spring Boot + REST + JPA
---------------------------------------------
[![Build Status](https://github.com/DanielMichalski/spring-boot-rest-example/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/DanielMichalski/spring-boot-rest-example/actions?query=workflow%3A%22Java+CI+with+Maven%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://github.com/DanielMichalski/spring-boot-rest-example/blob/master/LICENSE)

This project aims to present how to create a Spring Boot + REST + JPA Application

Libraries
---------------------------------------------
- Spring Boot 2
- Spring Data Repositories
- JPA (Hibernate)
- H2 Database

Requirements
---------------------------------------------
- [Java JDK](https://www.oracle.com/pl/java/technologies/javase-downloads.html) version 8+

How to run application
---------------------------------------------
On Windows
```bash
## Build application using Maven Wrapper
mvnw.cmd clean install

## Run Spring boot application using Maven Wrapper with embedded H2 database
mvnw.cmd spring-boot:run
```

On MacOS/ Linux
```bash
## Build application using Maven Wrapper
./mvnw clean install

## Run Spring boot application using Maven Wrapper with embedded H2 database
./mvnw spring-boot:run
```

Example API URL
---------------
```
http://localhost:8080/users
```

Video
---------------------------------------------
[![See on YouTube](http://img.youtube.com/vi/I1ydigiZ25g/0.jpg)](https://www.youtube.com/watch?v=I1ydigiZ25g)


Screens
---------------------------------------------
![alt text](https://github.com/DanielMichalski/spring-boot-rest-example/blob/master/src/main/resources/screens/screen1.png "Screen 1")

![alt text](https://github.com/DanielMichalski/spring-boot-rest-example/blob/master/src/main/resources/screens/screen2.png "Screen ")
