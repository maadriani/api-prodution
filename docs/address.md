# address API Spec

## Create address

Endpoint : POST /api/product/{idProduct}/addresses

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "name": "nama productnya",
  "street": "nama jalan nya apa",
  "city": "nama kota nya apa",
  "province": "nama provinsi nya apa",
  "country": "indonesia",
  "postcode": "123123"
}
```

Response Body (Success):

```json
{
  "data": {
    "id": "randomstring",
    "name": "nama productnya",
    "street": "nama jalan nya apa",
    "city": "nama kota nya apa",
    "province": "nama provinsi nya apa",
    "country": "indonesia",
    "postcode": "123123"
  }
}
```

Response Body (failed):

```json
{
  "errors": "product is not found"
}
```

## Update address

Endpoint : PUT /api/products/{idProduct}/addresses/{idAddresses}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Request Body :

```json
{
  "name": "nama productnya",
  "street": "nama jalan nya apa",
  "city": "nama kota nya apa",
  "province": "nama provinsi nya apa",
  "country": "indonesia",
  "postcode": "123123"
}
```

Response Body (Success):

```json
{
  "data": {
    "id": "randomstring",
    "name": "nama productnya",
    "street": "nama jalan nya apa",
    "city": "nama kota nya apa",
    "province": "nama provinsi nya apa",
    "country": "indonesia",
    "postcode": "123123"
  }
}
```

Response Body (failed):

```json
{
  "errors": "product is not found"
}
```

## Get address

Endpoint :GET /api/products/{idProduct}/addresses/{idAddresses}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success):

```json
{
  "data": {
    "id": "randomstring",
    "name": "nama productnya",
    "street": "nama jalan nya apa",
    "city": "nama kota nya apa",
    "province": "nama provinsi nya apa",
    "country": "indonesia",
    "postcode": "123123"
  }
}
```

Response Body (failed):

```json
{
  "errors": "product is not found"
}
```

## remove address

Endpoint :GET /api/products/{idProduct}/addresses/{idAddresses}

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success):

```json
{
  "product": "product addresses is ok"
}
```

Response Body (failed):

```json
{
  "errors": "product addresses is not found"
}
```

## list address

Endpoint :GET /api/product/{idProduct}/addresses

Request Header :

- X-API-TOKEN : Token (Mandatory)

Response Body (Success):

```json
{
  "data": [
    {
      "id": "randomstring",
      "name": "nama productnya",
      "street": "nama jalan nya apa",
      "city": "nama kota nya apa",
      "province": "nama provinsi nya apa",
      "country": "indonesia",
      "postcode": "123123"
    }
  ]
}
```

Response Body (failed):

```json
{
  "errors": "product is not found"
}
```
