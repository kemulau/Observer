# 🐉 Reino Encantado

Este projeto implementa o **padrão Observer** em um cenário divertido no qual um **Dragão** muda de humor, e diferentes **Aventureiros** reagem automaticamente. 🏰🧙‍♂️🛡️

## 📚 Padrão Observer

O **padrão Observer** é um padrão comportamental que define uma **dependência** entre objetos: um **sujeito** e múltiplos **observadores**. Sempre que o sujeito muda seu estado, ele **notifica** os observadores, que reagem automaticamente.

## 🧩 Componentes do Projeto

- **Sujeito**: `Dragao`, que notifica os observadores ao mudar de humor.
- **Observador**: Interface `Observador`, com o método `atualizarHumor`.
- **Observadores Concretos**: `Cavaleiro` e `Mago`, que reagem às mudanças.
- **Cliente**: `Cliente`, a classe principal que cria o sujeito e observadores.
  
## ⚙️ Como Executar

1. **Compile** o projeto:

   ```bash
   javac *.java
2. **Execute** o programa:

 ```bash
java Cliente


