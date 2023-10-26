FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com

WORKDIR /DevOps

COPY target/spring-boot-jpa-h2-0.0.1-SNAPSHOT.jar spring-boot-jpa-h2-0.0.1-SNAPSHOT.jar

CMD ["java","-jar","spring-boot-jpa-h2-0.0.1-SNAPSHOT.jar"]
