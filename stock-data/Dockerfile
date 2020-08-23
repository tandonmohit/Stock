FROM openjdk:8-jdk-alpine
ADD target/stock-data.jar stock-data.jar
ENTRYPOINT ["sh", "-c", "java -jar /stock-data.jar"]