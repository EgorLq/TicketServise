FROM openjdk:17
LABEL maintainer="SuperCassa"
COPY target/Super_Kassa-0.0.1-SNAPSHOT-plain.jar Super_Kassa.jar
ENTRYPOINT {"java","-jar","/Super_Kassa.jar"}
EXPOSE 8080