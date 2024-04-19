# User API Spec

## Register User

- Endpoint : POST /api/users

Request body :

```json
{
  "username": "Marwah",
  "password": "sangat rahasia",
  "name": " Marwah adriani"
}
```

response body (Success)

```json
{
  "data": "oke"
}
```

response body (Failed)

```json
{
  "error": "Username is not found"
}
```

## Login User

- Endpoint : POST /api/auth/login


response body (Success)

```json
{
  "data": {
    "token": "TOKEN",
    "expiredat": 1231231231231
  }
}
```

response body (Failed, 401)

```json
{
  "error": "Username is not found"
}
```

## get User

- Endpoint : GET /api/auth/current

Request Heade :
- X-API-TOKEN : Token ( Mandatory )

response body (Success)

```json
{
  "data": {
    "username" : "marwah",
    "name" :" marwah adriani"
  }
}
```

response body (Failed, 401)

```json
{
  "error": "data is not found"
}
```

## Update User

- Endpoint : PATCH /api/auth/current

Request Header :

- X-API-TOKEN : Token ( Mandatory )

Request body :
```json
{
    "name" : "marwah adriani", // put if only want to update name
    "password" :"terlalu rahasia" // if only want to update password
}
```

response body (Success)

```json
{
  "data": {
    "username" : "marwah",
    "name" :" marwah adriani"
  }
}
```

response body (Failed, 401)

```json
{
  "error": "data is not found"
}
```

## logout User
- Endpoint : DELETE /api/auth/logout

Request Header :
- X-API-TOKEN : Token ( Mandatory )

Response body :

```json
{
    "data":"OK"
}
```
