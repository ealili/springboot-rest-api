# Mrtechspecs REST API

This project contains the api for Mrtechspecs


## Table of Contents

1. [Tools](#tools)
1. [Dependencies](#dependencies)
1. [Getting Started](#getting-started)
1. [Database](#database)
1. [REST Endpoints](#rest-endpoints)

## Tools 

You will need:

* [Maven](https://maven.apache.org/) as your build tool
* Your favorite IDE
* JDK 1.8+
* [MySQL](https://www.mysql.com/)

## Dependencies

You will need:

* [Spring Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
* [MySQL Connector](https://mvnrepository.com/artifact/mysql/mysql-connector-java)
* [Spring WEB](https://mvnrepository.com/artifact/org.springframework/spring-web)
* [JUnit](https://mvnrepository.com/artifact/junit/junit)
* [JUnit Vintage Engine](https://mvnrepository.com/artifact/org.junit.vintage/junit-vintage-engine)
* [Spring Boot Test Starter](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test)
* [Spring Boot Maven Plugin](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-maven-plugin)

## Getting Started

First, clone the project:

```bash
$ git clone https://github.com/ealili/springboot-rest-api.git
```

Second, open the project using your favorite IDE and install all the listed dependencies above and you should be able to run the application.

If everything works, you should see a welcome page [here](http://127.0.0.1:8080/).

## Database

1. Create a MySQL database using the `mrtech.sql` script provided in the root folder.
1. Add credentials to `/src/main/resources/application.properties`

The default ones are:

``` 
spring.datasource.url=jdbc:mysql://localhost:3306/mrtech
spring.datasource.username=root
spring.datasource.password=
spring.jpa.database-platform = org.hibernate.dialect.MySQL5Dialect
spring.jpa.generate-ddl=true
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
spring.jpa.hibernate.ddl-auto = update
```

## REST Endpoints
