# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and source code into the container
COPY pom.xml .
COPY src ./src

# Build the application
RUN apt-get update && apt-get install -y maven && mvn clean package

# Copy the built JAR file into the container
COPY target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
