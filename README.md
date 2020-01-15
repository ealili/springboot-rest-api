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

Second, configure the [database](#database).

Finally, open the project using your favorite IDE and install all the listed dependencies above and you should be able to run the project.

If everything works, you should see an Index Page [here](http://127.0.0.1:8080/).

## Database

1. Create a MySQL database using the `mrtech.sql` script provided in the root folder.
1. Add credentials to `/src/main/resources/application.properties`.

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

### Index Endpoint

Index Page, later this endpoint will provide all the available routes.

* URL (http://localhost:8080/), METHOD = GET.

### Administrator Endpoints

#### Get an administrator by username and password 

* URL (http://localhost:8080/api/administrator), METHOD = POST, expects JSON body.

#### Save an administrator 

* URL (http://localhost:8080/api/administrator/save), METHOD = POST, expects JSON body.

#### Update an administrator by username

* URL (http://localhost:8080/api/administrator/update/{username}), METHOD = PUT, expects a path variable `username` and a JSON body.

#### Delete an administrator by username

* URL (http://localhost:8080/api/administrator/delete/{username}), METHOD = DELETE, expects a path variable `username`.

### Phone Endpoints

#### Get all phones

* URL (http://localhost:8080/api/phones), METHOD = GET.

#### Get phones by manufacturer name

* URL (http://localhost:8080/api/phones/{mname}), METHOD = GET, expects a path variable `mname`.

#### Get a phone by id

* URL (http://localhost:8080/api/phone/{id}), METHOD = GET, expects a path variable `id`.

#### Save a phone

* URL (http://localhost:8080/api/phone/save), METHOD = POST, expects a JSON body.

#### Update a phone by id

* URL (http://localhost:8080/api/phone/update/{id}), METHOD = PUT, expects a path variable `id` and a JSON body.

#### Delete a phone by id

* URL (http://localhost:8080/api/phone/delete/{id}), METHOD = DELETE, expects a path variable `id`.




