FROM maven:3.6.3-jdk-17 as builder
ARG MVN_ARGS
ADD ./src/ /app/src/
ADD ./pom.xml /app/pom.xml
WORKDIR /app
RUN mvn --batch-mode package ${MVN_ARGS}