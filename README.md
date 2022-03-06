------ How to execute ------
RUN mvn "clean install -Dmaven.test.skip" into management-consumer-service to generate the JAR

RUN mvn "clean install -Dmaven.test.skip" into management-producer-service to generate the JAR

RUN mvn "clean install -Dmaven.test.skip" into management-service to generate the JAR

RUN "docker-compose up" to launch docker-compose file

------ URLS ------

rabbitmq:
URL: http://localhost:15672/
login: guest
PASSWORD: guest

H2 console:
URL: http://localhost:8080/h2-console
JDBC URL=jdbc:h2:mem:serviceDb
USER NAME: root
PASSWORD: root
