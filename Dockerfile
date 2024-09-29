FROM openjdk:17-jdk

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8085

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "/app.jar"]
