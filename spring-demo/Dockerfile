FROM openjdk:8-jre

#ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "/usr/share/app/spring-demo.jar"]
ENTRYPOINT ["java", "-jar", "/usr/share/app/spring-demo.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/app/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/app/spring-demo.jar
