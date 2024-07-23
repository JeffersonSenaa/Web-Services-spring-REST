# Projeto de API REST com Spring Boot

Este projeto é uma implementação um serviço de cadastro de   

Dessa forma, o projeto trata-se da implementação de uma API RESTful utilizando Spring Boot, JPA/Hibernate e banco de dados H2-Console. Com isso, é possível compreender o paradigma relacional, implementar operações CRUD e realizar consultas com Spring Data fazendo requisições http.

## Objetivo Geral

- Implementar operações de CRUD
- Refletir sobre decisões de design para um banco de dados relacional
- Realizar consultas com Spring em requisições http

## Tecnologias Utilizadas

- Java 11
- Spring Boot 3.2.5
- Banco de Dados H2-Console
- Spring Data JPA
- Hibernate
- Postman   

## Arquitetura do Projeto
![Arquitetura](/img/arquitetura-camadas.png)

## Diagrama de Classes
![Padrão de Projeto](/img/diagrama.png)

## Diagrama dos Objetos
![Diagrama de Objetos](/img/diagrama-objetos.png)

## Configuração do Ambiente

### Pré-requisitos

- Java 11 ou superior
- Banco de Dados H2-Console instalado
- Maven instalado

### Configuração do Application Properties

Configure a conexão com o H2-Console em `src/main/resources/application.properties`:

## Rodando a Aplicação

- Clone o repositório

- Compile e execute a aplicação

```compile
mvn clean install
mvn spring-boot:run
```
## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Obrigado ;)
