From openjdk:21-jdk-slim

WORKDIR \app 

COPY build/libs/*.jar divya.jar

Expose 8082

CMD ["java", "-jar", "divya.jar"]