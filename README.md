## SPRING-REST-API

## Test
```bash
$ curl http://localhost:8080/hello | jq
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   115    0   115    0     0  34513      0 --:--:-- --:--:-- --:--:-- 38333
{
  "timestamp": 1759374214832,
  "koreaTime": "2025-10-02T12:03:34.832613463+09:00[Asia/Seoul]",
  "message": "Hello, World!"
}
```

## Build
```bash
$ ./gradlew bootjar
```
## Run
```bash
$ java -jar build/lib/hello-api-<VERSION>.jar
```

