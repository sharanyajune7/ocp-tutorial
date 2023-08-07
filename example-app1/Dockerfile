FROM adoptopenjdk/openjdk11:ppc64le-ubi-jdk-11.0.20_8-slim

# openjdk:17-jdk-alpine3.14
# docker pull adoptopenjdk/openjdk11:ppc64le-ubi-jdk-11.0.20_8-slim

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENV ENV_PORT=8082
ENV ENV_APP_NAME=docker_spring_app
ENV ENV_SECRET1=Docker_secret_1
ENV ENV_SECRET2=Docker_secret_2

EXPOSE 8081 
EXPOSE 8082 
EXPOSE 8083 8084 8085

ENTRYPOINT ["java","-jar","/app.jar"]