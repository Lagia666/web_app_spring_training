# (1)
FROM maven3.8.3-openjdk-17 AS build
COPY src homeappsrc
COPY pom.xml homeapp
# (2)
RUN mvn -f homeapppom.xml clean package

# (3)
FROM eclipse-temurin17-jdk-focal
# (4)
COPY --from=build homeapptargetmaven_training-1.0.0-SNAPSHOT.jar usrlocallibapp.jar
# (5)
EXPOSE 8080
ENTRYPOINT [java,-jar,usrlocallibapp.jar]