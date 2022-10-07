FROM openjdk:17

LABEL maintainer="test@neuefische.de"

ADD backend/target/movies.jar movies.jar

CMD [ "sh", "-c", "java -DServer.port=$PORT -jar /movies.jar"]