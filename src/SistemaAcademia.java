import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SistemaAcademia {

    public static void criarAluno(ArrayList<AlunoAcademia> lista, Scanner scanner) {
        AlunoAcademia alunov1 = new AlunoAcademia();
        System.out.println("---- Informações necessárias para Registro ----");

        alunov1.setNome(lerEntradaValida(scanner, "Digite o Nome do Aluno: "));
        alunov1.setMatricula(lerEntradaValida(scanner, "Digite a Matrícula do Aluno: "));
        alunov1.setEndereco(lerEntradaValida(scanner, "Digite o Endereço do Aluno: "));
        alunov1.setCidade(lerEntradaValida(scanner, "Digite a Cidade do Aluno: "));
        alunov1.setCpf(lerEntradaValida(scanner, "Digite o CPF do Aluno: "));
        alunov1.setCep(lerEntradaValida(scanner, "Digite o CEP do Aluno: "));
        alunov1.setTelefone(lerEntradaValida(scanner, "Digite o Telefone do Aluno: "));
        alunov1.setRg(lerEntradaValida(scanner, "Digite o RG do Aluno: "));
        alunov1.setEmail(lerEntradaValida(scanner, "Digite o Email do Aluno: "));
        alunov1.setSexo(lerEntradaValida(scanner, "Digite o Sexo do Aluno: "));
        alunov1.setPlanoAcademia(lerEntradaValida(scanner, "Digite o Plano escolhido: "));
        alunov1.setDataNascimento(lerEntradaValida(scanner, "Digite a Data de Nascimento: "));

        lista.add(alunov1);
        System.out.println("Parabéns! Seu cadastro foi concluído.");
    }

    public static void listarAlunos(ArrayList<AlunoAcademia> lista) {
        System.out.println("----- Lista de todos os Registros -----");
        for (AlunoAcademia a : lista) {
            System.out.println(a);
        }
    }

    public static void buscarAluno(ArrayList<AlunoAcademia> lista, Scanner scanner) {
        System.out.println("---- Buscar dados por Matrícula ----");
        System.out.print("Informe a matrícula do aluno que deseja listar: ");
        String buscarMatricula = scanner.nextLine();
        boolean encontrado = false;
        for (AlunoAcademia aluno : lista) {
            if (aluno.getMatricula().equalsIgnoreCase(buscarMatricula)) {

                System.out.println(aluno);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void editarAluno(ArrayList<AlunoAcademia> lista, Scanner scanner) {

            System.out.println("----- Editar registro -----");
            String editarMatricula = scanner.nextLine();
            boolean encontrado = false;
                for (AlunoAcademia aluno : lista) {
                    System.out.print("Informe a matrícula do aluno que deseja editar: ");
                    if (aluno.getMatricula().equalsIgnoreCase(editarMatricula)) {

                        System.out.println("Registro atual:");
                        System.out.println(aluno);

                        System.out.println("\n Qual campo deseja editar?");


                        System.out.println("Opções: nome, matricula, endereco, cidade, cpf, cep, telefone, rg, email, dataNascimento" +
                                 "sexo, planoAcademia");
                        String campo = scanner.nextLine().toLowerCase();

                        switch (campo) {
                            case "nome":
                                aluno.setNome(lerEntradaValida(scanner, "Novo nome: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "matricula":
                                aluno.setMatricula(lerEntradaValida(scanner,"Nova matrícula: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "endereco":
                                aluno.setEndereco(lerEntradaValida(scanner, "Novo endereço: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "cidade":
                                aluno.setCidade(lerEntradaValida(scanner, "Nova cidade: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "cpf":
                                aluno.setCpf(lerEntradaValida(scanner, "Novo CPF: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "cep":
                                aluno.setCep(lerEntradaValida(scanner, "Novo CEP: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "telefone":
                                aluno.setTelefone(lerEntradaValida(scanner, "Novo telefone: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "rg":
                                aluno.setRg(lerEntradaValida(scanner, "Novo RG: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "email":
                                aluno.setEmail(lerEntradaValida(scanner, "Novo email: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case  "datanascimento":
                                aluno.setDataNascimento(lerEntradaValida(scanner, "Novo Data de Nascimento: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "sexo":
                                aluno.setSexo(lerEntradaValida(scanner, "Novo sexo: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            case "planoacademia":
                                aluno.setPlanoAcademia(lerEntradaValida(scanner, "Novo plano de academia: "));
                                System.out.println("Registro editado com sucesso!");
                                break;
                            default:
                                System.out.println("Campo inválido. Tente novamente.");
                                break;
                        }
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Aluno com a matrícula " + editarMatricula + " não encontrado.");

                }
    }

    public static void excluirAluno(ArrayList<AlunoAcademia> lista, Scanner scanner) {
        System.out.println("----- Excluir registro -----");
        System.out.print("Informe a matrícula do aluno que deseja excluir: ");
        String matriculaExcluir = scanner.nextLine();

        Iterator<AlunoAcademia> iterator = lista.iterator();
        boolean removido = false;
        while (iterator.hasNext()) {
            if (iterator.next().getMatricula().equalsIgnoreCase(matriculaExcluir)) {
                iterator.remove();
                removido = true;
                break;
            }
        }
        if (removido) {
            System.out.println("Aluno removido.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void salvarListaCSV(ArrayList<AlunoAcademia> lista, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (AlunoAcademia aluno : lista) {
                writer.write(aluno.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo CSV.");
        }
    }

    public static ArrayList<AlunoAcademia> carregarAlunos(String caminhoArquivo) {
        ArrayList<AlunoAcademia> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length < 12) continue;

                AlunoAcademia aluno = new AlunoAcademia();
                aluno.setNome(dados[0]);
                aluno.setMatricula(dados[1]);
                aluno.setCpf(dados[2]);
                aluno.setEndereco(dados[3]);
                aluno.setCidade(dados[4]);
                aluno.setCep(dados[5]);
                aluno.setTelefone(dados[6]);
                aluno.setRg(dados[7]);
                aluno.setEmail(dados[8]);
                aluno.setDataNascimento(dados[9]);
                aluno.setSexo(dados[10]);
                aluno.setPlanoAcademia(dados[11]);

                lista.add(aluno);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar CSV: " + e.getMessage());
        }

        return lista;
    }

    public static boolean executarOpcao(int opcao, ArrayList<AlunoAcademia> lista, String caminhoArquivo, Scanner scanner) {
        switch (opcao) {
            case 1:
                criarAluno(lista, scanner);
                salvarListaCSV(lista, caminhoArquivo);
                break;
            case 2:
                listarAlunos(lista);
                break;
            case 3:
                buscarAluno(lista, scanner);
                break;
            case 4:
                editarAluno(lista, scanner);
                salvarListaCSV(lista, caminhoArquivo);
                break;
            case 5:
                excluirAluno(lista, scanner);
                salvarListaCSV(lista, caminhoArquivo);
                break;
            case 6:
                System.out.println("Encerrando o sistema.");
                return false;
            default:
                System.out.println("Digite uma opção válida!");
                break;
        }
        return true;
    }

    public static String lerEntradaValida(Scanner scanner, String mensagem) {
        String entrada;
        do {
            System.out.print(mensagem);
            entrada = scanner.nextLine();
            if (entrada == null || entrada.trim().isEmpty()) {
                System.out.println("Entrada inválida, digite novamente.");
            }
        } while (entrada == null || entrada.trim().isEmpty());
        return entrada;
    }
}