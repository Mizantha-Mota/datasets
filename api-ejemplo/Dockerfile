# Partimos de una imagen de Java 17 con Alpine (más ligera)
FROM eclipse-temurin:17-jre-alpine
# Establecemos el directorio de trabajo dentro del contenedor
WORKDIR /app
# Permite usar cualquier nombre de artefacto generado por Maven
ARG JAR_FILE=target/*.jar
# Copiamos el JAR generado en el contenedor
COPY ${JAR_FILE} app.jar
# Exponemos el puerto 8080 (el que usa Spring Boot por defecto)
EXPOSE 8080
# Comando para ejecutar la aplicación cuando el contenedor arranque
ENTRYPOINT ["java", "-jar", "app.jar"]