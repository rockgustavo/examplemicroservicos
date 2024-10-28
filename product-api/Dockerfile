# Etapa de Build
FROM maven:3.8.1 AS build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

# Etapa de Execução
FROM openjdk:11-jdk
WORKDIR /app
COPY --from=build /build/target/*.jar ./application.jar
EXPOSE 8081

# Comando de Inicialização
ENTRYPOINT ["java", "-jar", "application.jar"]