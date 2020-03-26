FROM openjdk:8-jre

ENTRYPOINT ["java", "-jar", "/usr/share/app/pw-demo.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
#ADD target/lib           /usr/share/app/lib
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/app/pw-demo.jar
