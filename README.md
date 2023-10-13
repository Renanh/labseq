# Quickstart: Deploy microservice applications to Docker

## 1. Prerequisites

- [Git](https://git-scm.com/downloads).
- [Java Development Kit (JDK)](/java/azure/jdk/), version 17.
- [Maven](https://maven.apache.org/), version 3.9.x
- [Node](https://nodejs.org/en/), version 18
- [Angular](https://angular.io/), version 16
- [Docker Desktop or Docker Compose](https://docs.docker.com/compose/install/).


## 2. Setup

### 2.1. Clone the repository

```console  
$ git clone https://github.com/Renanh/labseq.git  
```  

### 2.2. Web Application Build

```console  
$ npm install
```  

### 2.3. API Build

```console  
$ mvn clean install 
```  

### 2.4. Start with docker-compose

```console  
$ docker-compose up -d  
```

## 5. Validate the apps

The following sections describe how to validate the deployment.

### 5.1. Local run the applications
#### 5.1.1 Inside the `labseq-service` folder, run:
```console  
$ mvn spring-boot:run
```
#### 5.1.2 Inside the `labseq-frontend` folder, run:
```console  
$ npm start
```
### 5.1. Bookmarks
- Link to the [Web Application](http://localhost:4200/)
- Link to the [API Documentation](http://localhost:8080/swagger-ui/index.html#/)


## Copyright
Released under the Apache License 2.0. See the [LICENSE](github.com/Renanh/labseq/blob/main/LICENSE) file.