# Bookshelf REST

## dependencies
* Spring Data REST
* Spring Boot
* Thymeleaf
* JPA
* H2
* React

## Reference
https://spring.io/guides/tutorials/react-and-spring-data-rest/

## Usage
* git clone
* mvn package
* mvnw spring-boot:run

## How to post sample data with "cURL".
```
curl -X POST localhost:8080/api/books -d "{\"title\": \"The art of project management\", \"author\": \"Scott Berkun\", \"publisher\": \"O'REILLY\", \"publishDate\": \"2006-9-5\"}" -H "Content-Type:application/json"
```