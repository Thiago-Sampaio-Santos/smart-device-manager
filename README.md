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

## Estrutura de Pastas

---

src/
├── main/
│   ├── command/       # Implementação do padrão Command
│   ├── dispositivos/  # Interfaces e classes concretas de dispositivos
│   ├── factory/       # Implementação do Factory Method
│   ├── manager/       # Singleton de gerenciamento do sistema
│   ├── observer/      # Implementação do padrão Observer
│   ├── strategy/      # Estratégias de resposta a eventos
│   ├── theme/         # Padrões Composite e Decorator para temas
│   └── App.java       # Classe principal de execução


---

## Como Executar

### Pré-requisitos
- **Java 17** instalado 
- Um IDE (Eclipse, IntelliJ, VS Code, etc.)

### Clonar o repositório
```bash
git clone https://github.com/Thiago-Sampaio-Santos/smart-device-manager.git
cd sistema-iot

