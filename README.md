# Padrão Bridge em Java

Este projeto demonstra a implementação do **padrão de projeto Bridge** em Java.  
O objetivo é **separar a abstração da implementação**, permitindo que ambos evoluam de forma independente.  
No exemplo, temos **controles remotos** que podem operar diferentes tipos de **dispositivos** (TV e Rádio).

## Estrutura do Projeto

- **Dispositivo (interface)**  
  - Métodos: `ligar()`, `desligar()`

- **TV / Radio (ConcreteImplementor)**  
  - Implementam os métodos da interface `Dispositivo`.

- **ControleRemoto (Abstraction)**  
  - Possui um atributo `Dispositivo`.  
  - Métodos: `ligar()`, `desligar()`.

- **ControleAvancado (RefinedAbstraction)**  
  - Herda de `ControleRemoto`.  
  - Método adicional: `ligarEDesligar()`.

- **App (Cliente)**  
  - Método `main()` que demonstra o uso dos controles com diferentes dispositivos.



