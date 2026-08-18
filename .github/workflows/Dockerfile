FROM eclipse-temurin:17-jdk-jammy AS build WORKDIR /app COPY . . RUN ./gradlew clean bootJar --no-daemon
FROM eclipse-temurin:17-jre-jammy WORKDIR /app ARG JAR_FILE=build/libs/*.jar COPY --from=build /app/${JAR_FILE} app.jar ENTRYPOINT ["java","-jar","/app/app.jar"]
