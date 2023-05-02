FROM openjdk:11
ADD target/flight-ws-0.0.1-SNAPSHOT.jar flight-ws-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "flight-ws-0.0.1-SNAPSHOT.jar"]
