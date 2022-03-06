FROM openjdk:8-jdk-alpine
RUN apk --no-cache add curl
COPY target/webapp-service-0.0.1-SNAPSHOT.jar webapp-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/webapp-service-0.0.1-SNAPSHOT.jar"]