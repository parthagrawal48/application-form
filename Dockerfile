# Use OpenJDK 21 base image
FROM eclipse-temurin:21-jdk-jammy

# Metadata
LABEL maintainer="your-email@example.com"

# Set working directory inside the container
WORKDIR /app

# Copy your JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
