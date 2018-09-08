FROM openjdk:8-jdk-alpine
COPY /target/helloBoot.jar /opt/helloBoot.jar
ENTRYPOINT ["java","-jar","/opt/helloBoot.jar"]
EXPOSE 8080