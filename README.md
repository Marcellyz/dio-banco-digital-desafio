# Banco Digital Desafio DIO 💰🪙🚀
Este repositório foi criado para o estudo de Programação Orientada a Objetos, onde desenvolvi a implementação de um sistema bancário simples, utilizando conceitos como classes, classes abstratas, interfaces e listas.

## 📍Stack utilizada

<div>
  <img align="inline_block" alt="java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
</div>

## 📦 Estrutura do projeto
````
dio-banco-digital-desafio/
├── .idea/
├── .vscode/
├── bin/                              
├── src/                               
|   ├── banco/
|   |  ├── cliente/
|   |  |  └── Cliente.java
|   |  ├── contas/
|   |  |  ├── Conta.java
|   |  |  ├── ContaCorrente.java
|   |  |  └── ContaPoupanca.java
|   |  ├── Banco.java
|   |  └── IConta.java
|   └── Main.java
└── ... (demais diretórios e arquivos)
````

## 📱 Diagrama de Classes
````mermaid
classDiagram
class Cliente{
    - String nome
    + getNome() String
    + setNome(String Nome)
}
class ContaCorrente{
    + imprimirConta()
}
class ContaPoupanca{
    + imprimirConta()
}
class Banco{
    - String nome
    - List~Conta~ contas
    + getNome() String
    + setNome(String Nome) 
    + getContas() List~Conta~
    + setContas(List~Conta~ contas)
}
class IConta{
    <<Interface>>
    +sacar(double valor)
    +transferir(double valor)
    +depositar(double valor, Conta contaDestino)
    +extratoConta()
}
class Conta{
    #int agencia
    #int numeroConta
    #saldo double
    #cliente Cliente
    -int AGENCIA_PADRAO = 1$
    -int sequencial = 1$
    Conta(Cliente cliente) 
    +getAgencia() int
    +getNumeroConta() int 
    +getSaldo() double
}
class Main

Conta <|-- ContaCorrente
Conta <|-- ContaPoupanca
Conta -- Cliente
IConta <|.. Conta
Conta .. Banco
Main *-- Cliente
Main *-- Conta
Main *-- IConta
```
