# PayFlow 💳  
**Digital Payment Flow using Microservices**

PayFlow is a backend fintech application built with **Java** and **Spring Boot**, designed using a **microservices architecture**.  
It supports secure digital payments, wallet management and event-driven transaction processing with high scalability and reliability.

---

## Key Features

- **JWT-based Authentication & Authorization**
- **Wallet Management** with real-time balance updates
- **Transaction Processing** using Kafka (event-driven)
- **Rewards & Notifications** triggered asynchronously
- **API Gateway** for centralized routing and security
- **Dockerized Deployment** for all services

---

## Architecture

PayFlow follows a **distributed microservices architecture** where:
- Each service is independently deployable
- Services communicate asynchronously using **Apache Kafka**
- Security and routing are handled by **Spring Cloud Gateway**
- **Redis** is used for caching and rate limiting

---

## Tech Stack

| Category | Technologies |
|--------|-------------|
| Language | Java |
| Framework | Spring Boot |
| Architecture | Microservices |
| Authentication | JWT, Spring Security |
| Messaging | Apache Kafka |
| Database | PostgreSQL, H2 |
| Cache | Redis |
| API Gateway | Spring Cloud Gateway |
| Containerization | Docker |

---

## Microservices

| Service | Description |
|--------|------------|
| **user-service** | User registration, login, JWT generation |
| **wallet-service** | Wallet creation and balance management |
| **transaction-service** | Transaction processing and Kafka event publishing |
| **reward-service** | Reward processing based on transactions |
| **notification-service** | User notifications via Kafka events |
| **api-gateway** | Centralized routing, authentication, and authorization |

---

## Application Flow

1. User authenticates via **user-service**
2. Wallet is created and managed by **wallet-service**
3. Transactions are initiated through **transaction-service**
4. Events are published to **Kafka**
5. **reward-service** and **notification-service** consume events
6. All requests pass through **api-gateway**

---

## Deployment

All services are containerized using **Docker** and can be started together using Docker Compose.

---

## Screenshots
(Add screenshots here if needed)
