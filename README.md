# 📚 Sistema de Gerenciamento de Empréstimo de Livros

Este projeto simples em Java visa simular um sistema de gerenciamento básico para empréstimo de livros em uma biblioteca. Ele foi usado para praticar conceitos fundamentais de Programação Orientada a Objetos (POO), como classes, objetos, listas e interação com o usuário através do console.

## ✨ Funcionalidades

O sistema oferece as seguintes funcionalidades principais:

1.  **Listagem de Livros Disponíveis**: Exibe todos os livros que não estão emprestados no momento.
2.  **Empréstimo de Livros**: Permite ao usuário selecionar um livro pelo seu ID e registrar um empréstimo, marcando o livro como indisponível.
3.  **Interação via Console**: Todo o sistema opera através de comandos e entradas do usuário via terminal.

## 🚀 Como Rodar o Projeto

Siga os passos abaixo para baixar e executar este projeto em sua máquina:

### Pré-requisitos

* **Java Development Kit (JDK) 8 ou superior**: Certifique-se de ter o Java instalado. Você pode baixá-lo em [oracle.com/java/technologies/downloads](https://www.oracle.com/java/technologies/downloads/).
* **Git**: Para clonar o repositório. Baixe em [git-scm.com/downloads](https://git-scm.com/downloads).
* **IDE de sua preferência**: Um ambiente de desenvolvimento como IntelliJ IDEA, Eclipse ou VS Code com extensões Java.

### Passos

1.  **Clone o Repositório**:
    Abra seu terminal ou prompt de comando e execute:
    ```bash
    git clone https://github.com/dksrc/ProjetoLivraria
    cd SistemaLivraria
    ```

2.  **Compile o Projeto**:
    Dentro da pasta raiz do projeto, compile os arquivos Java. Se você estiver usando uma IDE como IntelliJ, ela geralmente faz isso automaticamente. Via terminal:
    ```bash
    javac src/br/com/sistemalivraria/*.java src/br/com/sistemalivraria/model/*.java src/br/com/sistemalivraria/service/*.java
    ```
    *Se você estiver usando uma IDE, geralmente basta abrir o projeto e a IDE cuidará da compilação.*

3.  **Execute o Programa**:
    Após a compilação, execute o arquivo principal (Main.java). Via terminal:
    ```bash
    java -cp src br.com.sistemalivraria.Main
    ```
    *Em uma IDE, você pode simplesmente clicar no botão "Run" (geralmente um triângulo verde) ao lado do arquivo `Main.java`.*

## 📖 Como Funciona (Fluxo Básico)

1.  Ao iniciar, o programa perguntará se você deseja ver a lista de livros disponíveis (`SIM` ou `NÃO`).
2.  Se `SIM`, uma lista numerada de livros disponíveis será exibida.
3.  Você poderá então escolher um livro pelo seu `ID` e informar seu nome para o empréstimo.
4.  Após o empréstimo, o livro será marcado como indisponível.
5.  O programa continuará em *loop* ou finalizará, dependendo da sua interação.

## 📁 Estrutura do Projeto

* `src/`: Contém todo o código-fonte Java.
    * `br/com/sistemalivraria/`: Pacote principal.
        * `Main.java`: Ponto de entrada do programa.
        * `model/`: Contém as classes que representam os objetos do nosso domínio.
            * `Autor.java`: Classe para representar um autor.
            * `Emprestimo.java`: Classe para registrar um empréstimo.
            * `Livro.java`: Classe para representar um livro.
        * `service/`: Contém a lógica de negócio do sistema.
            * `Biblioteca.java`: Classe que gerencia os livros e empréstimos.

---
Criado com ❤️ para fins de aprendizado em Java.
