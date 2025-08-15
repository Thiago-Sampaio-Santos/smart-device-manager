# Sistema de Gerenciamento de Dispositivos Inteligentes

Este projeto simula um sistema modular para gerenciamento de dispositivos inteligentes, como sensores e atuadores, utilizando diversos padrões de projeto e princípios de arquitetura limpa.

---

## Funcionalidades
- Cadastro e gerenciamento de dispositivos (sensores, atuadores, etc.).
- Monitoramento e execução de ações com base em **eventos**.
- Troca de temas de interface (modo básico e modo escuro).
- Reação automática a eventos (exemplo: temperatura > 30°C → ligar ventilador).
- Estrutura modular para fácil extensão.

---

## Tecnologias Utilizadas
- **Java 17** (compatível com versões superiores)
- **Padrões GoF**:
  - Factory Method
  - Singleton
  - Composite + Decorator
  - Observer
  - Command
  - Strategy
- **Princípios SOLID** aplicados (SRP, OCP, DIP, etc.)

---

## Padrões de Projeto Aplicados

| Padrão        | Finalidade                                                                 |
|---------------|------------------------------------------------------------------------------|
| Factory       | Criação de dispositivos de forma flexível                                   |
| Singleton     | Gerenciamento centralizado (SystemManager, EventManager)                    |
| Observer      | Notificação de eventos para listeners                                       |
| Command       | Encapsulamento de ações em dispositivos                                     |
| Strategy      | Definição de estratégias de resposta a eventos                              |
| Decorator     | Aplicação de temas visuais dinâmicos                                        |
| Composite     | Organização hierárquica de componentes visuais                              |

---

## Estrutura do Projeto
Pastas `src/main`:
- `command/` — Implementação do padrão Command: comandos encapsulados (ex.: ligar ventilador).
- `dispositivos/` — Interfaces e classes concretas de dispositivos: abstrações de `Dispositivo`, `Sensor`, `Atuador`.
- `factory/` — Implementação do Factory Method: criação de dispositivos (`FabricaDeDispositivos`).
- `manager/` — Singleton de gerenciamento do sistema: gerenciador principal (`GerenciadorDoSistema`).
- `observer/` — Implementação do padrão Observer: eventos e assinatura/notificação.
- `strategy/` — Estratégias de resposta a eventos.
- `theme/` — Padrões Composite e Decorator para temas.

## Como Executar (sugestão)
1. Compilar o projeto (ex.: `javac` no diretório `src` ou configurar um `pom.xml`/Maven, se desejado).
2. Executar `App.java` como aplicação Java simples para simular o fluxo de eventos.
3. Ajustar e ampliar o cenário de simulação criando novos dispositivos, comandos e estratégias.


### Pré-requisitos
- **Java 17** instalado 
- Um IDE (Eclipse, IntelliJ, VS Code, etc.)



## Diagrama UML de Classes

![Diagrama UML](documentacao/uml/Diagrama.png)

## Este diagrama mostra como os padrões de projeto foram aplicados:

-  **Factory Method**: Criação de sensores e atuadores.
-  **Strategy**: Resposta flexível a eventos.
-  **Observer**: Reação automática a eventos de sensores.
-  **Composite + Decorator**: Composição de temas visuais.
-  **Command**: Encapsulamento de ações em comandos.
-  **Singleton**: Gerenciador central do sistema.
