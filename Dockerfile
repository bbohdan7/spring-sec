FROM openjdk:8-jdk-alpine
COPY target/spring-sec-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java", "-jar", "./spring-sec-0.0.1-SNAPSHOT.jar"]