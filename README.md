# java-spring-starter
[spring initializr](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.2.2&packaging=jar&jvmVersion=17&groupId=com.ifx-study-group&artifactId=java-spring-starter&name=java-spring-starter&description=Demo%20project%20for%20Spring%20Boot&packageName=com.ifx-study-group.java-spring-starter)

- Gradle - Groovy
- Java
- Spring Boot v3.2.2
- Packaging: .jar
- Java: v17
- Dependencies: N/A

## 起動方法
1. 環境変数のコピー
```bash
cp .env.example .env
```

2. Dockerコンテナ群の起動
```bash
docker-compose up -d
```

3. bootアプリケーションの起動
```bash
./gradlew build
./gradlew bootRun

# もしくは
gradle build
gradle bootRun
```