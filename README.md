# Hotel Reservation Management API

## Description

This project is a RESTful API for managing hotel room reservations. The API allows you to create, read, update, and delete reservations. Each reservation includes a customer name, check-in date, check-out date, room type, and status (reserved, cancelled, completed).


## Dependencies

The following dependencies are required for this project:

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- H2 Database
- Springfox Swagger

## Getting Started

### Create a new Spring Boot application

Use [Spring Initializr](https://start.spring.io/) to create a new Spring Boot application with the necessary dependencies:

- Spring Web
- Spring Data JPA
- H2 Database
- Springfox Swagger

### Define the `Reservation` Entity

Create the `Reservation` entity with fields for ID, customer name, check-in date, check-out date, room type, and status.

### Create the `ReservationRepository`

Create an interface for the repository extending `JpaRepository`.

### Create the `ReservationService` Interface

Define an interface for the reservation service with methods for finding all reservations, finding a reservation by ID, saving a new reservation, updating an existing reservation, and deleting a reservation by ID.

### Implement the `ReservationServiceImpl`

Implement the service interface, providing the necessary business logic for managing reservations.

### Create the `ReservationController`

Create a REST controller to handle CRUD operations, mapping HTTP requests to the corresponding service methods.

### Document the API with Swagger

Add the necessary configurations for Swagger in your application to enable API documentation and testing. Ensure that the Swagger documentation is accessible at `/swagger-ui/`.



