# sistema-lanchonete-java
Sistema de gerenciamento de lanchonete desenvolvido em Java para aplicação de estruturas de dados como List, Set, Map e Queue.

# 🍔 Sistema de Gerenciamento de Lanchonete em Java

## 📋 Sobre o projeto

Este projeto foi desenvolvido como atividade acadêmica com o objetivo de criar um sistema de gerenciamento para uma lanchonete utilizando a linguagem Java.

O sistema utiliza estruturas de dados para organizar pedidos, produtos, códigos promocionais e vendas realizadas durante a semana.

## 🎯 Funcionalidades

O sistema permite:

* Manter os pedidos na ordem em que foram registrados.
* Remover produtos cancelados dos pedidos.
* Impedir o cadastro de códigos promocionais duplicados.
* Localizar produtos através do código.
* Organizar as vendas por dia e por produto.
* Contabilizar a quantidade de unidades vendidas de cada item.
* Gerar relatórios sobre as vendas semanais.

## 🍽️ Cardápio

| Código | Produto   |    Preço |
| ------ | --------- | -------: |
| 1      | Café      |  R$ 5,00 |
| 2      | Suco      |  R$ 8,50 |
| 3      | Bolo      |  R$ 7,00 |
| 4      | Sanduíche | R$ 15,00 |
| 5      | Salada    | R$ 12,00 |

## 🧠 Estruturas de dados utilizadas

### Map

Utilizado para localizar produtos através de seus códigos e organizar as vendas por dia e produto.

### Queue

Utilizado para manter os pedidos na ordem em que foram registrados.

### List

Utilizado para armazenar os produtos presentes em cada pedido e permitir a remoção de produtos cancelados.

### Set

Utilizado para impedir o cadastro de códigos promocionais duplicados.

## 📊 Relatórios

O sistema deve responder às seguintes perguntas:

* Quantas unidades de café foram vendidas durante a semana?
* Qual foi o produto mais vendido?
* Qual dia teve a maior quantidade de vendas?
* Quantos sanduíches foram vendidos na quinta-feira?
* Qual foi a média diária de vendas de suco?

## 🛠️ Tecnologias utilizadas

* Java
* Programação Orientada a Objetos
* Collections Framework
* Git
* GitHub

## 👩‍💻 Estrutura do projeto

```text
sistema-lanchonete-java/
│
├── README.md
├── .gitignore
│
├── src/
│   ├── Main.java
│   │
│   ├── model/
│   │   ├── Produto.java
│   │   └── Pedido.java
│   │
│   └── service/
│       └── LanchoneteService.java
```

## 🚀 Como executar

1. Clone o repositório.
2. Abra o projeto em uma IDE Java.
3. Compile os arquivos do projeto.
4. Execute a classe `Main.java`.

## 📚 Objetivo acadêmico

Este projeto tem como objetivo praticar conceitos fundamentais da linguagem Java, Programação Orientada a Objetos e estruturas de dados, incluindo List, Set, Map e Queue.
