FROM openjdk:17
WORKDIR /usr/src/app
COPY ./jar/jsonapigateway-0.0.1-SNAPSHOT.jar jsonapigateway-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","jsonapigateway-0.0.1-SNAPSHOT.jar","-Dserver.port=$PORT"]