FROM maven:3.5-jdk-11 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests


FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
COPY --from=build /usr/src/app/target/restaurant-microservices.jar /usr/app/restaurant-microservices.jar
ENTRYPOINT ["java","-jar","/usr/app/restaurant-microservices.jar"]