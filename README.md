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

------ How to execute ------
RUN mvn "clean install -Dmaven.test.skip" into management-processor-service to generate the JAR

RUN mvn "clean install -Dmaven.test.skip" into management-producer-consumer-service to generate the JAR

RUN mvn "clean install -Dmaven.test.skip" into management-service to generate the JAR

RUN "docker-compose up" to launch docker-compose file

------ Tests TODO ------


Via POSTMAN or other, send a message using this url "http://localhost:8082/send"

Result in a console:
producer-consumer-server   | 2022-03-06 21:57:03.395  INFO 1 --- [ueue.consumer-1] c.e.m.c.ServicesManagementConsumer       : The tag is serv1
producer-consumer-server   | 2022-03-06 21:57:03.401  INFO 1 --- [ueue.consumer-1] c.e.m.c.ServicesManagementConsumer       : The action is ACTIVE
