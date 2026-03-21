# 🛒 Sistema de Gerenciamento de Produtos — API REST com Spring Boot

API REST completa para gerenciamento de produtos, desenvolvida com **Java + Spring Boot + JPA/Hibernate + SQLite**.

> Evolução do projeto [sistema-produtos-jdbc](https://github.com/haveneryck/sistema-produtos-jdbc), reescrito com arquitetura moderna usando Spring Boot.

---

## 🚀 Tecnologias Utilizadas

- Java 22
- Spring Boot 4.0.3
- Spring Data JPA / Hibernate
- SQLite
- Maven
- Postman (testes)

---

## 📁 Estrutura do Projeto

```
src/main/java/com/haveneryck/meu_projeto_springboot/
├── MeuProjetoSpringbootApplication.java  # Classe principal
├── controller/
│   └── ProdutoController.java            # Endpoints REST
├── model/
│   └── Produto.java                      # Entidade JPA
├── repository/
│   └── ProdutoRepository.java            # Acesso ao banco
└── service/
    └── ProdutoService.java               # Regras de negócio
```

---

## ⚙️ Como Executar

### Pré-requisitos

- Java 22+
- Maven

### Passos

```bash
# Clone o repositório
git clone git@github.com:haveneryck/sistema-produtos-spring-boot.git

# Entre na pasta
cd sistema-produtos-spring-boot

# Execute o projeto
./mvnw spring-boot:run
```

> O banco de dados SQLite (`meu_banco_de_dados.db`) é gerado automaticamente na primeira execução.

A API estará disponível em: `http://localhost:8080`

---

## 📌 Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/produtos` | Lista todos os produtos |
| GET | `/produtos/{id}` | Busca produto por ID |
| POST | `/produtos` | Cadastra novo produto |
| PUT | `/produtos/{id}` | Atualiza produto existente |
| DELETE | `/produtos/{id}` | Remove produto |

---

## 📦 Exemplo de Requisição

### POST `/produtos`

```json
{
  "nome": "Notebook",
  "quantidade": 10,
  "preco": 3500.00,
  "status": "disponível"
}
```

### Resposta

```json
{
  "id": 1,
  "nome": "Notebook",
  "quantidade": 10,
  "preco": 3500.00,
  "status": "disponível"
}
```

---

## 🗄️ Configuração do Banco de Dados

```properties
spring.datasource.url=jdbc:sqlite:meu_banco_de_dados.db
spring.datasource.driver-class-name=org.sqlite.JDBC
spring.jpa.database-platform=org.hibernate.community.dialect.SQLiteDialect
spring.jpa.hibernate.ddl-auto=update
```

---

## 📈 Evolução do Projeto

| Versão | Tecnologia | Repositório |
|--------|-----------|-------------|
| v1 | JDBC + JavaFX | [sistema-produtos-jdbc](https://github.com/haveneryck/sistema-produtos-jdbc) |
| v2 | Spring Boot + JPA | Este repositório |

---

## 👨‍💻 Autor

**Vinícius Oliveira Brito**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-haveneryck-blue?logo=linkedin)](https://linkedin.com/in/haveneryck)
[![GitHub](https://img.shields.io/badge/GitHub-haveneryck-black?logo=github)](https://github.com/haveneryck)
