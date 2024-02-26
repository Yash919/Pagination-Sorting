# Pagination and Sorting for Spring Boot REST API

This project demonstrates how to implement pagination and sorting functionality in a Spring Boot-based RESTful API for managing products. The API allows users to retrieve a list of products, sort them based on different fields, and paginate through the results efficiently.

## Features
- **Retrieve All Products**: Endpoint to get all products available in the database.
- **Sort Products**: Sorts products based on specified fields such as name, quantity, or price.
- **Paginate Products**: Implements pagination to efficiently handle large datasets, allowing users to navigate through pages of product results.

## Technologies Used
- **Spring Boot:** Framework for building Java-based enterprise applications.
- **Spring Data JPA:** Simplifies database access and manipulation by providing repository support.
- **H2 Database:** Lightweight in-memory database for storing product information during development.
- **Lombok:** Library to reduce boilerplate code in Java classes with annotations like @Data, @NoArgsConstructor, and @AllArgsConstructor.

## Endpoints.
- Retrieve All Products:
    - Method: GET
    - URL: localhost:8080/products 
- Sort Products:
    - Method: POST
    - URL: localhost:8080/products/{field}
- Paginate Products:
    - Method: POST
    - URL: localhost:8080/products/pagination/{offset}/{pageSize}
- Sort and Paginate Products:
    - Method: POST
    - URL: localhost:8080/products/pagination/{offset}/{pageSize}/{field}

## Contributor
**-Yash Mehta-** 🚀


