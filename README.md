# Projeto Final Bootcamp IT Experts - API Conta Bancária

## Tecnologias utilizadas:
  - Java 11
  - Spring Boot
  - Spring Web
  - Spring Data JPA
  - MySQL Connector Java 
  - Lombok
  - Banco de Dados MySQL

## Diagrama de classes do projeto (Visão Java)

![image](https://user-images.githubusercontent.com/8313184/155442793-67fd8411-74a0-4c6b-aa19-7c22a71066cc.png)

## Modelo de dados do projeto (Visão MySQL)

![image](https://user-images.githubusercontent.com/8313184/155441445-b59fbec9-e6ec-41c0-afd5-2a47ad00f32c.png)

## Rotas da API:

GET /api/v1/accounts/
  -> Lista todas as contas

GET /api/v1/accounts/{id}
  -> Lista uma única conta localizada pelo id

POST /api/v1/accounts
  -> Cria uma conta
