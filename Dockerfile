FROM java:openjdk-8
COPY $PWD/target/crickplay.jar /opt/crickplay.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar","/opt/crickplay.jar"]
EXPOSE 8080

