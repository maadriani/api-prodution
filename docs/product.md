# product API Spec

## Create Product

Endpoint : POST /api/products

Request Header:

- X-API-TOKEN : Token (Mandatory)

Request body:

```json
{
  "name": " komputer ",
  "jumlah": "20",
  "type": "Electronic",
  "address": "Sukabumi Jawa barat"
}
```

Response body(success):

```json
{
  "data": {
    "id": "random string",
    "name": " komputer ",
    "jumlah": "20",
    "type": "Electronic",
    "address": "Sukabumi Jawa barat"
  }
}
```

Response body(failed):

```json
{
  "errors": "data is not found"
}
```

## Update Product

Endpoint : PUT /api/products/{idProducts}

Request Header:

- X-API-TOKEN : Token (Mandatory)

Request body:

```json
{
  "name": " komputer ",
  "jumlah": "20",
  "type": "Electronic",
  "address": "Sukabumi Jawa barat"
}
```

Response body(success):

```json
{
  "data": {
    "id": "random string",
    "name": " komputer ",
    "jumlah": "20",
    "type": "Electronic",
    "address": "Sukabumi Jawa barat"
  }
}
```

Response body(failed):

```json
{
  "errors": "data is not found"
}
```

## Get Product

Endpoint :GET /api/products/{idProducts}

Request Header:

- X-API-TOKEN : Token (Mandatory)

Response body(success):

```json
{
  "data": {
    "id": "random string",
    "name": " komputer ",
    "jumlah": "20",
    "type": "Electronic",
    "address": "Sukabumi Jawa barat"
  }
}
```

Response body(failed, 404):

```json
{
  "errors": "data is not found"
}
```

## Search Product

Endpoint : GET /api/products

Query param :

- name : String, Product Name
- jumlah : String, jumlah product
- type : String, jumlah product
- address : String, jumlah product
- page : interger, start from 0, default 0
- size : interger, default 10

Request Header:

- X-API-TOKEN : Token (Mandatory)

Response body(success):

```json
"data" : [
    {
        "id": "random string",
        "name": " komputer ",
        "jumlah": "20",
        "type": "Electronic",
        "address": "Sukabumi Jawa barat"
    }
],
"pagging" :{
    "currentPage" : 0
    "totalPage":10,
    "size" : 10
}
```

Response body(failed):

## Remove Product

Endpoint : DELETE /api/products/{idProducts}

Request Header:

- X-API-TOKEN : Token (Mandatory)

Response body(success):

```json
{
  "data": "prosess is ok"
}
```

Response body(failed):

```json
{
  "errors": "data is not found"
}
```
