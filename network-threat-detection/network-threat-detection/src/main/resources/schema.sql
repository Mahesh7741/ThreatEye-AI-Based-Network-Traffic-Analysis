server:
  port: 8080

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/network_security
    username: postgres
    password: Mahesh@123
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true

logging:
level:
    org.springframework: INFO
