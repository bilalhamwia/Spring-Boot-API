# Spring-Boot-API

this is basic Sales System With REST API , MySQL


## Features

- Model to DB for Client, Product, Sale
- Create and Save (API)
- Get All (API)
- Get With ID (API)
- Update All (API)


##  Model
- Product (ID,productName, productDscription, productCategory, productDate).

- Client (ID, clientName, ClientLastName, clientMobile).

- Sale (ID, saleClient, saleSeller, saleTotal, saleDate).
## API Reference

#### Post Product

```
  POST http://localhost:8080/api/products
```
{
    
    BODY JSON
    "productName": "mouse",
    "productDscription" :"test mouse",
    "productCategory" :"IT",
    "productDate" :"7/2/2022"
}

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get All Product

```http
  GET http://localhost:8080/api/products
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Your API key        |


#### Get Product By ID

```http
  GET http://localhost:8080/api/products/1
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |


#### Post Product

```
  POST http://localhost:8080/api/products
```
{
    
    BODY JSON
    "productName": "mouse",
    "productDscription" :"test mouse",
    "productCategory" :"IT",
    "productDate" :"7/2/2022"
}

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get All Product

```http
  GET http://localhost:8080/api/products
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Your API key        |


#### Get Product By ID

```http
  GET http://localhost:8080/api/products/1
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### update Product By ID

```http
  PUT http://localhost:8080/api/products/1
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

- This Example for All Product, Client, Sale but need edit body JSON (Follow Model)
