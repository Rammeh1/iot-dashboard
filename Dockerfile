# Use a Maven image as the build stage
FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app

# Copy the project's POM file and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the application source code
COPY src src

# Build the application
RUN mvn package

# Use a smaller OpenJDK image as the runtime stage
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/ubidots_dashboard.jar app.jar

# Expose the port your application listens on (if different from 8080)
EXPOSE 8080

# Define the entry point
CMD ["java", "-jar", "app.jar"]
