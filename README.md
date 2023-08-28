# Project ReadMe

## Global CORS Configuration

This project contains a global CORS configuration to allow cross-origin requests for the Spring Boot application. The configuration is set up using the following code:

```java
@Configuration
@EnableWebMvc
public class GlobalCorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
            .allowedHeaders("*");
    }
}
```

## Milestone4 Application

The main application class, `Milestone4Application`, is responsible for starting the Spring Boot application:

```java
@SpringBootApplication(scanBasePackages = "com.milestone4")
public class Milestone4Application {

    public static void main(String[] args) {
        SpringApplication.run(Milestone4Application.class, args);
    }
}
```

## Product Controller

The `ProductController` class serves as the REST API controller for managing product-related operations:

- Creating a new product: `POST /product`
- Getting all products: `GET /products`
- Getting a product by ID: `GET /product/{id}`
- Updating a product: `PUT /product/{id}`
- Deleting a product: `DELETE /products/{id}`
- Handling OPTIONS request: `OPTIONS /products/{id}`

The controller uses the `ProductRepository` to interact with the underlying database.

## Product Model

The `Product` class represents the product entity in the database. It contains fields for `id`, `productname`, `proudctdescription`, and `price`.

## Product Repository

The `ProductRepository` interface extends `JpaRepository` and is used for CRUD operations on the `Product` entity.

## Exception Handling

Exceptions related to product not found are handled using custom exception classes and a controller advice.

- `ProductNotFoundException` is a custom exception thrown when a product with a given ID is not found.
- `ProductNotFound` is a controller advice class that handles the `ProductNotFoundException` and returns an error message.

## Tests

Several unit tests are included to ensure the functionality of the application and exception handling:

- `ProductControllerTest` tests various methods of the `ProductController` class.
- `ProductNotFoundExceptionTest` tests the custom exception message in `ProductNotFoundException`.

## Features

- Cross-Origin Resource Sharing (CORS) configuration is globally set to allow various HTTP methods and headers from any origin.
- The RESTful API provides endpoints to manage products, including creation, retrieval, updating, and deletion.
- Exception handling ensures proper error messages are returned when products are not found.

## Dependencies

- Spring Boot: Framework for creating standalone, production-grade Spring-based applications.
- Spring Data JPA: Simplifies database access and management using Java Persistence API.
- JUnit 5: Testing framework for unit tests.
- H2 Database: In-memory database for testing purposes.

## Usage

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Run the `Milestone4Application` class to start the Spring Boot application.
4. Use API endpoints to interact with products.

## API

- Create a new product:
    - `POST /product`

- Get all products:
    - `GET /products`

- Get a product by ID:
    - `GET /product/{id}`

- Update a product:
    - `PUT /product/{id}`

- Delete a product:
    - `DELETE /products/{id}`

- OPTIONS request:
    - `OPTIONS /products/{id}`

## Project Requirements Assessment

This project fulfills the following requirements:

- Implements a global CORS configuration to enable cross-origin requests.
- Provides a RESTful API for CRUD operations on product entities.
- Includes exception handling for cases where products are not found.
- Contains unit tests to validate the functionality and exception handling.
- Utilizes Spring Boot, Spring Data JPA, and JUnit for implementation and testing.

## Conclusion

This Spring Boot application showcases how to build a RESTful API for managing products, incorporating global CORS configuration and exception handling. It allows the creation, retrieval, updating, and deletion of products using various HTTP methods. The project is structured to adhere to industry best practices and coding standards, providing a solid foundation for further development and expansion.
