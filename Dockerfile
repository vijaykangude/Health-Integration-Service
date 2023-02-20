FROM openjdk
VOLUME /tmp
WORKDIR tmp/usr/src/app
EXPOSE 8080
ADD target/health-integration-service.jar tmp/usr/src/app/health-integration-service.jar
ENTRYPOINT ["java","-jar","tmp/usr/src/app/health-integration-service.jar"]