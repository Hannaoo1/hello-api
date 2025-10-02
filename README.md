## Dockerizing

- https://spring.io/guides/gs/spring-boot-docker
- openJDK 17

```bash

# 빌드
$ ./gradlew clean bootJar
$ sudo docker build --build-arg JAR_FILE=build/libs/\*.jar \
-t hannaoo1/hello-api:0.3.0 .


# Run
# sudo docker run -d -p 8030:8080 --name hello030 hannaoo1/hello-api:0.3.0

```



