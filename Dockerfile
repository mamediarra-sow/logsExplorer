# Stage 1: Build using Maven inside Docker
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app

# Copy source code
COPY . .

# Build the app (no tests to speed up)
RUN mvn clean package -DskipTests

# Use a lightweight JDK image
FROM openjdk:17-jdk-slim

# Set app JAR file name
#ARG JAR_FILE=target/*.jar

# Copy the jar file into the container
COPY --from=builder /app/target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
