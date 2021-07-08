FROM adoptopenjdk/openjdk11:alpine-jre
RUN apk add --no-cache curl
WORKDIR /opt/app
ARG JAR_FILE=target/recommendation-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

