# 🐾 PetManager

![Java](https://img.shields.io/badge/Java-17+-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.2-brightgreen)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

---

## 🎬 Demonstração

![PetManager Demo](https://media.giphy.com/media/3o6ZtpxSZbQRRnwCKQ/giphy.gif)  
*Exemplo de uso da API PetManager em ação.*

---

## 🐶 Sobre o Projeto

O **PetManager** é um sistema de gerenciamento de animais de estimação, desenvolvido com **Java Spring Boot**, que permite cadastrar, atualizar, listar e deletar informações de pets e seus tutores. Ideal para aprendizado, prototipação e pequenas aplicações.

---

## 🚀 Funcionalidades

- ✅ Listar todos os animais cadastrados
- ✅ Buscar um animal por ID
- ✅ Cadastrar novos animais
- ✅ Atualizar dados de animais existentes
- ✅ Deletar animais por ID

---

## 🛠 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Maven**
- **Lombok**
- **REST API**

---

## 📂 Estrutura do Projeto
br.com.fiap
│
├── controller
│ └── AnimalController.java - Controla endpoints REST
│
├── model
│ └── Animal.java - Modelo de dados do Animal
│
├── repository
│ └── AnimalRepository.java - Repositório em memória
│
├── service
│ └── AnimalService.java - Lógica de negócio
│
└── petmanager
└── App.java - Classe principal Spring Boot


---

## 🚀 Endpoints da API

Todos os endpoints são baseados em `/animais`.

| Método | Endpoint           | Descrição                          |
|--------|------------------|-----------------------------------|
| GET    | `/animais`         | Lista todos os animais            |
| GET    | `/animais/{id}`    | Busca um animal pelo ID           |
| POST   | `/animais`         | Cadastra um novo animal           |
| PUT    | `/animais/{id}`    | Atualiza um animal existente      |
| DELETE | `/animais/{id}`    | Deleta um animal pelo ID          |


---

## 📝 Exemplo de Requisições

GET `/animais`
```json
[
  {
    "id": 1,
    "nome": "Rex",
    "especie": "Cachorro",
    "idade": 5,
    "raca": "Labrador",
    "sexo": "Macho",
    "nomeTutor": "João",
    "telefoneTutor": "99999-0000"
  }
]
```



POST /animais
```json
{
  "nome": "Bolinha",
  "especie": "Cachorro",
  "idade": 2,
  "raca": "Poodle",
  "sexo": "Fêmea",
  "nomeTutor": "Ana",
  "telefoneTutor": "97777-2222"
}
```


PUT /animais/1
```json

{
"nome": "Rex",
"especie": "Cachorro",
"idade": 6,
"raca": "Labrador",
"sexo": "Macho",
"nomeTutor": "João",
"telefoneTutor": "99999-0000"
}
```


DELETE /animais/1
# Retorna 204 No Content se deletado com sucesso.


## ⚡ Como Rodar o Projeto

1. Clone o repositório:
git clone https://github.com/SeuUsuario/PetManager.git
cd PetManager

2. Compile e rode o projeto:
mvn spring-boot:run

3. Acesse a API:
http://localhost:8080/animais


# 🛠 Próximas melhorias

* Persistência em banco de dados (MySQL, PostgreSQL, etc.)

* Validação de dados de entrada

* Documentação Swagger

* Autenticação e autorização

* Testes unitários e de integração
