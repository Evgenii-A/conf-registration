
FROM openjdk:11-jre-slim

VOLUME /tmp

ADD /target/conf-registration-spring-boot.jar conf-registration-spring-boot.jar

ENTRYPOINT ["java", "-jar", "/conf-registration-spring-boot.jar"]