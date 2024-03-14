
FROM adoptopenjdk:21

WORKDIR /app

COPY target/*.jar app.jar
COPY src/main/resources/application.yml application.yml

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
