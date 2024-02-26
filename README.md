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

## Endpoints
- Retrieve All Products:
    - Method: GET
    - URL: localhost:8080/products

      <img width="1453" alt="image" src="https://github.com/Yash919/Pagination-Sorting/assets/60219195/57a10224-0f25-4d1f-b977-ac0d119a3cb0">

- Sort Products:
    - Method: POST
    - URL: localhost:8080/products/{field}
  
      <img width="1472" alt="image" src="https://github.com/Yash919/Pagination-Sorting/assets/60219195/b7d7a75d-f88c-4846-bd15-ea418e68915e">

- Paginate Products:
    - Method: POST
    - URL: localhost:8080/products/pagination/{offset}/{pageSize}

      <img width="1457" alt="image" src="https://github.com/Yash919/Pagination-Sorting/assets/60219195/e4530da5-b4fc-44e7-9b70-b670a40deff6">

- Sort and Paginate Products:
    - Method: POST
    - URL: localhost:8080/products/pagination/{offset}/{pageSize}/{field}
     
      <img width="1456" alt="image" src="https://github.com/Yash919/Pagination-Sorting/assets/60219195/bfac3540-6ed1-48ff-b07b-d9b8c8bd399e">

## Contributor
**-Yash Mehta-** 🚀


