FROM openjdk:8-jdk-alpine
RUN apk --no-cache add curl
COPY target/management-service-0.0.1-SNAPSHOT.jar management-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/management-service-0.0.1-SNAPSHOT.jar"]