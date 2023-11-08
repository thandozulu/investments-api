# Automated Withdrawals REST API

Automated Withdrawals is a Spring Boot REST API that enables investors to automate their withdrawal requests for their financial products. This application streamlines the process, allowing investors to easily manage their withdrawals with confidence.

## Features

- Secure and efficient withdrawal automation.
- User-friendly API for managing withdrawal requests.
- Seamless integration with a PostgreSQL database.
- Hibernate ORM for database schema generation.
- Dockerized PostgreSQL for easy development setup.

## Getting Started

To run this project locally, you'll need to set up a PostgreSQL database using Docker for Hibernate schema generation. Follow these steps:

### Prerequisites

- [Docker](https://www.docker.com/get-started) installed on your local machine.

### Setting Up PostgreSQL with Docker

Run the following command to create a PostgreSQL container with the required configurations:

```bash
docker run --name postgres-container -e POSTGRES_DB=root -e POSTGRES_USER=root -e POSTGRES_PASSWORD=root -p 5432:5432 -d postgres
