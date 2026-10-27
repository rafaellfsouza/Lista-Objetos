<div align="center">

# 🏛️ Lista de Exercícios — Orientação a Objetos em Java

**Cinco classes que modelam entidades do mundo real com atributos, métodos de comportamento, encapsulamento e getters/setters.**

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Classes](https://img.shields.io/badge/classes-5-7C3AED?style=flat-square)
![Foco](https://img.shields.io/badge/foco-POO-0EA5E9?style=flat-square)

</div>

---

## 📖 Sobre

Lista de exercícios de **Programação Orientada a Objetos**: cada arquivo modela uma entidade com seus atributos e comportamentos, praticando **encapsulamento** (`private` + getters/setters) e **coesão** (o método pertence a quem tem o estado).

## 🏗️ Classes

Cada classe vive em seu próprio pacote (`com.mycompany.<entidade>`).

### 🚗 `Carro` — `Carro.java`
**Atributos:** `marca`, `modelo`, `ano`, `cor`, `placa`, `velocidadeAtual`

| Método | Comportamento |
|:---|:---|
| `ligar()` / `desligar()` | alterna o estado do veículo |
| `acelerar(int velocidade)` | incrementa `velocidadeAtual` |
| `frear(int reducao)` | decrementa `velocidadeAtual` |
| `trocarMarcha(String marcha)` | informa a marcha selecionada |

### 📱 `Celular` — `Celular.java`
**Atributos:** `marca`, `modelo`, `sistemaOperacional`, `bateria`, `cor`

| Método | Comportamento |
|:---|:---|
| `ligar()` / `desligar()` | controla o estado do aparelho |
| `fazerChamada(String numero)` | simula uma ligação |
| `enviarMensagem(String numero, String texto)` | simula o envio de SMS |
| `abrirApp(String nomeApp)` | simula a abertura de um aplicativo |

### 🏦 `ContaBancaria` — `Contabancaria.java`
A única classe com **regra de negócio real** sobre o estado:

| Método | Regra aplicada |
|:---|:---|
| `depositar(double valor)` | soma ao saldo |
| `sacar(double valor)` | só executa se houver saldo suficiente; senão informa *"Saldo insuficiente"* |
| `transferir(ContaBancaria destino, double valor)` | debita de si e credita em outra conta, respeitando o saldo |
| `consultarSaldo()` | exibe o saldo atual |

> **Atributos:** `numeroDaConta`, `titular`, `saldo` e `tipo` (corrente ou poupança).

### 📖 `Livro` — `Livro.java`
**Atributos:** `titulo`, `autor`, `isbn`, `editora`, `numeroDePaginas`

| Método | Comportamento |
|:---|:---|
| `abrir()` / `fechar()` | informa o título entre aspas |
| `virarPagina()` | avança a leitura |
| `lerCapitulo(int numero)` | lê um capítulo específico |

### 👤 `Pessoa` — `Pessoa.java`
**Atributos:** `nome`, `idade`, `cpf`, `email`, `altura`, `peso`

| Método | Comportamento |
|:---|:---|
| `andar()` / `dormir()` | ações básicas da entidade |
| `comer(String comida)` | recebe o alimento como parâmetro |
| `falar(String mensagem)` | imprime a fala entre aspas |
| `correr(double velocidade)` | ação com parâmetro numérico |

## 🧠 Conceitos aplicados

- **Encapsulamento** — atributos `private` com getters e setters
- **Estado vs. comportamento** — métodos que alteram atributos da própria instância
- **Colaboração entre objetos** — `transferir()` recebe outra `ContaBancaria` como parâmetro
- **Validação de invariantes** — saque e transferência só ocorrem com saldo suficiente
- **Modelagem de domínio** — traduzir entidades reais em classes

## ▶️ Como executar

```bash
git clone https://github.com/rafaellfsouza/Lista-Objetos.git
cd Lista-Objetos

javac ContaBancaria.java
java ContaBancaria
```

---

<div align="center">

<sub>Desenvolvido por <a href="https://github.com/rafaellfsouza"><b>Rafael Luiz Ferreira de Souza</b></a> · <code>Java</code> <code>POO</code> <code>Encapsulamento</code></sub>

</div>
