# PayFlow 💳
**Digital Payment Flow using Microservices**

PayFlow is a backend fintech application built with **Java** and **Spring Boot**, using a **microservices architecture**.  
It supports secure digital payments, wallet management, and event-driven transaction processing with high scalability and reliability.

---

## Key Features

- **JWT Authentication & Authorization**
- **Wallet Management** with real-time balance updates
- **Event-Driven Transaction Processing** using Kafka
- **Asynchronous Rewards & Notifications**
- **API Gateway** for centralized routing and security
- **Dockerized Deployment** for all services

---

## Architecture

PayFlow uses a **distributed microservices architecture**:
- Independently deployable services
- Asynchronous communication via **Kafka**
- Security and routing via **Spring Cloud Gateway**
- **Redis** for caching and rate limiting

---

## Tech Stack

| Category | Technologies |
|----------|-------------|
| Framework | Spring Boot |
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
2. Wallet is created/managed by **wallet-service**
3. Transactions are initiated via **transaction-service**
4. Transaction events are published to **Kafka** and consumed by **reward-service** and **notification-service**
5. All requests pass through **api-gateway**
   
---

## Screenshots

<img width="1920" height="686" alt="Screenshot (84)" src="https://github.com/user-attachments/assets/5e353c87-f949-4cf2-bca7-6786c4f1619e" />

<img width="1920" height="661" alt="Screenshot (85)" src="https://github.com/user-attachments/assets/73c5e509-6d5f-423d-8824-24372804ad47" />

<img width="1920" height="740" alt="Screenshot (86)" src="https://github.com/user-attachments/assets/c9d53865-c86e-44ea-afa3-1dc115ae3c83" />

<img width="1920" height="580" alt="Screenshot (87)" src="https://github.com/user-attachments/assets/649b859e-90f5-4be3-88c2-f97bb890814e" />

<img width="1920" height="811" alt="Screenshot (88)" src="https://github.com/user-attachments/assets/1c5b2aba-c96b-4f79-8ebf-e1b60f516141" />

<img width="1550" height="321" alt="image" src="https://github.com/user-attachments/assets/cb37f5f9-d34c-4a43-87af-62eecf99b6df" />

<img width="1920" height="782" alt="Screenshot (89)" src="https://github.com/user-attachments/assets/8da25a9b-f213-4dc9-b510-753ce95edebb" />

<img width="1920" height="818" alt="Screenshot (90)" src="https://github.com/user-attachments/assets/e35810b7-0261-4561-8ffa-6aa20c8a7747" />

<img width="1601" height="694" alt="image" src="https://github.com/user-attachments/assets/b7c32a24-229d-48ca-99af-f96e03681e6f" />

<img width="1483" height="585" alt="image" src="https://github.com/user-attachments/assets/6e7a5266-a5bc-45fb-b9f3-7ac168dd5880" />

---

## Deployment

All services are containerized using **Docker** and can be started together using Docker Compose.

<img width="1920" height="1015" alt="Screenshot (93)" src="https://github.com/user-attachments/assets/45c0a763-bd6a-4026-b3e6-2e2876339371" />

