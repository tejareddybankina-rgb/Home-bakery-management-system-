# Home Bakery Management System

A beginner-friendly Full Stack Development (FSD) project for managing a home bakery.

## Technology Stack

- Frontend: HTML5, CSS3, JavaScript
- UI/UX: Responsive dashboard, cards, forms, tables, status badges
- Backend: Java 17 + Spring Boot
- API: REST API
- Database: MySQL
- Architecture: Controller → Service → Repository → Database
- Build tool: Maven

## Features

- Dashboard with total products and orders
- Add bakery products
- View product list
- Add customer orders
- View orders
- Update order status
- Delete products
- MySQL persistence
- REST APIs
- Responsive UI

## Project Structure

```text
home-bakery-management-system/
├── frontend/
│   ├── index.html
│   ├── products.html
│   ├── orders.html
│   ├── css/style.css
│   └── js/app.js
├── backend/
│   ├── pom.xml
│   └── src/main/java/com/bakery/
│       ├── BakeryApplication.java
│       ├── controller/
│       ├── model/
│       ├── repository/
│       └── service/
├── database/
│   └── bakery.sql
└── README.md
```

## Database Setup

1. Install MySQL.
2. Create/import the database script from `database/bakery.sql`.
3. Check the username/password in:
   `backend/src/main/resources/application.properties`

Default example:
- Database: `home_bakery`
- Username: `root`
- Password: `root`

Change the password to your own MySQL password.

## Run Backend

Open the `backend` folder in IntelliJ IDEA / Eclipse / VS Code and run:

```bash
mvn spring-boot:run
```

Backend runs at:

```text
http://localhost:8080
```

## Run Frontend

Open `frontend/index.html` with a browser or use VS Code Live Server.

The frontend calls the Spring Boot REST APIs at:

```text
http://localhost:8080/api
```

## Main APIs

### Products
- `GET /api/products`
- `POST /api/products`
- `DELETE /api/products/{id}`

### Orders
- `GET /api/orders`
- `POST /api/orders`
- `PUT /api/orders/{id}/status`

## GitHub

Create a repository named `home-bakery-management-system`, then upload this project.

Do not upload passwords or real customer information to a public repository.
