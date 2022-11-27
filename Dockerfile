FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-docker-jenkin.jar spring-boot-docker-jenkin.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-jenkin.jar"]