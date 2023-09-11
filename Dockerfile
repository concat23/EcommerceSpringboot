FROM openjdk:11
WORKDIR /app
SHELL ["/bin/bash", "-c"]
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
#RUN ./mvnw clean
#RUN ./mvnw compile
##RUN ./mvnw package -DskipTests
#RUN ./mvnw install
#RUN ./mvnw test
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]

#====================================

#FROM openjdk:11
#WORKDIR /app
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#COPY src ./src
#CMD ["./mvnw", "spring-boot:run"]