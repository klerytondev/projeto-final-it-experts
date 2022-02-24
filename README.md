# Projeto Final Bootcamp IT Experts

##Tecnologias utilizadas:
  - Java 11
  - Spring Boot versão 2.6.3
  - Spring Web
  - Spring Data JPA
  - MySQL Connector Java 
  - Lombok
  - Banco de Dados MySQL

##Diagrama de classes preliminar do projeto (Visão Java)

![image](https://user-images.githubusercontent.com/8313184/155441330-5487fb1b-129b-4602-9863-82322d287aa3.png)

##Modelo de dados do projeto (Visão MySQL)

![image](https://user-images.githubusercontent.com/8313184/155441445-b59fbec9-e6ec-41c0-afd5-2a47ad00f32c.png)

##Rotas da API:

GET /api/v1/accounts/
  Lista todas as contas

GET /api/v1/accounts/{id}
  Lista uma única conta localizada pelo id

POST /api/v1/accounts
  Cria um conta
