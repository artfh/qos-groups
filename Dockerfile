FROM openjdk:8-jdk-alpine
MAINTAINER Artem Grinstein <artem.grinstein@greenstones.de>
RUN addgroup -S demo && adduser -S demo -G demo
USER demo:demo
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} worker.jar
ENTRYPOINT ["java","-jar","/worker.jar"]