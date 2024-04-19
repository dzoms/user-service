FROM maven:3.9.6 AS build

WORKDIR /dzoms/user-service

COPY /backend-parent/ ./backend-parent/

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src src
RUN mvn package -DskipTests

FROM openjdk:21

WORKDIR /dzoms/user-service

COPY --from=build /dzoms/user-service/target/user-service-1.0.0.jar .

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "user-service-1.0.0.jar"]