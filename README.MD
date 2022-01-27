H2DB + Heroku + Postman + Microservice Architecture + Spring Boot + Gradle


# Microservice 2 Transaction

### Endpoints:

#### Save Product

````
POST /api/transaction HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
Content-Type: application/json
Content-Length: 41

{
    "userId" :2,
    "productId":2
}
````

#### Get Products

```
GET /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
```

#### Delete Product

```
DELETE /api/transaction/1 HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
```
