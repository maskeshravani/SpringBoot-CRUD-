# Spring Boot CRUD Applications

This repository features multiple Spring Boot projects implementing CRUD operations with Hibernate and REST APIs for managing various types of records.

Projects Included:

Vehicle Management System: Handles vehicle details (make, model, year, color, price).

Endpoints:

POST /insertDataVehicle

DELETE /deleteDataVehicle/{id}

PUT /updateDataVehicle/{v_id}

GET /singleDataVehicle?v_id=

GET /allRecordVehicle

Employee Management System: Manages employee details.



Endpoints:

POST /insertDataEmp

DELETE /deleteDataEmp/{id}

PUT /updatedataEmp/{e_id}

GET /singleDataEmp?e_id=

GET /allRecordEmp

Laptop Management System: Manages laptop records.



Endpoints:

POST /insertLaptop

DELETE /deleteLaptop/{id}

PUT /updateLaptop/{id}

GET /getLaptop?id=

GET /getAllLaptops

User Registration System: Handles user registration details.



Endpoints:

POST /insertDataRe

DELETE /deleteDataRe/{id}

PUT /updateDataRe/{id}

GET /singleDataRe?id=

GET /allRecordsRe

Student Management System: Manages student records (name, city, ID).



Endpoints:

POST /Savedata

DELETE /deleteData/{id}

PUT /updateData/{stud_id}

GET /getSingleData?stud_id=

GET /getAllRecord

Dependencies:

Spring Boot

Hibernate

Jakarta Persistence API

Usage:

Run each project and interact with their APIs using tools like Postman or any REST client. These projects are ideal for efficiently managing records in various domains.
