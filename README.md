# 💪 Sistema de Gerenciamento de Academia - TechFit

Este é um sistema em Java para o **cadastro e gerenciamento de alunos** de uma academia. Ele permite realizar operações básicas de CRUD (Criar, Ler, Atualizar, Excluir) com persistência de dados em um arquivo `.txt` (ou `.csv`).

# Trabalho Final A3 
## Disciplina: Programação de Soluções Computacionais


## 📁 Estrutura do Projeto

O sistema é composto por:

- `Main.java`: Classe principal que inicializa o programa e exibe o menu para o usuario.
- `SistemaAcademia.java`: Contém as funções de CRUD e manipulação do arquivo.
- `AlunoAcademia.java`: Classe com os atributos dos alunos.
- `ArquivosAlunos.txt`: arquivo onde os dados dos alunos são armazenados.

---

## 🛠️ Requisitos

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-downloads.html)
- Terminal ou IDE como VS Code / IntelliJ IDEA / Eclipse

---

## ▶️ Como compilar e executar

###  1. Compile os arquivos

Abra o terminal na pasta onde estão os arquivos `.java` e execute:

```bash
javac Main.java SistemaAcademia.java AlunoAcademia.java
```

###  2. Execute o programa
Após a compilação, execute com:

```bash
java Main
```
## 💡 Funcionalidades

- ✅ Cadastro de alunos
- 📋 Listagem de todos os registros
- 🔍 Busca por matrícula
- ✏️ Edição de dados
- ❌ Exclusão de registros
- 💾 Salvamento automático no arquivo ArquivosAlunos.txt

## 📂 Formato do arquivo de dados (ArquivosAlunos.txt)
### Cada linha representa um aluno, com os campos separados por vírgulas:

#### Nome,Matrícula,CPF,Endereço,Cidade,CEP,Telefone,RG,Email,DataNascimento,Sexo,PlanoAcademia

## 💻 Autores

### Vinicius Eduardo Campos de carvalho
- Github: 
https://github.com/ViniciusEDcampos?tab=repositories


### Tiago Gesualdo de Cavalho
- Github:
  https://github.com/ViniciusEDcampos?tab=repositories


### Pablo Ferreira Rodrigues
- Github:
  https://github.com/ViniciusEDcampos?tab=repositories

