# Exercise 9 - Spring Boot with H2 Database

## Objective
Develop a basic Spring Boot application integrated with the H2 in-memory database using Spring Data JPA.

## Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Project Structure
- Entity: Book
- Repository: BookRepository
- Controller: BookController

## Configuration
Configured in `application.properties`:
- H2 Database
- Hibernate DDL Auto Update
- H2 Console Enabled
- Server Port: 8081

## Result
- Spring Boot application started successfully.
- H2 Database connected successfully.
- BOOK table created automatically.
- H2 Console accessed at:
  http://localhost:8081/h2-console
