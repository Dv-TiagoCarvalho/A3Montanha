import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<AlunoAcademia> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //maneira para formatar a data de nascimento do aluno(usando uma biblioteca do java)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        boolean continuar = true;
        int opcao = 0;

        System.out.println("----- Academia TechFit -----");

        while (continuar) {
            System.out.println("\nEscolha a opção que deseja usar: ");
            System.out.println(" 1 - Criar novo registro"
                    + "\n 2 - Listar todos os Registros"
                    + "\n 3 - Buscar registro por matrícula"
                    + "\n 4 - Editar registro"
                    + "\n 5 - Excluir registro"
                    + "\n 6 - Sair");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine();
            }
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
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

                    System.out.print("Digite a Data de Nascimento do aluno (dd/MM/yyyy): ");
                    String dataStr = scanner.nextLine();

                    try {
                        LocalDate dataNascimento = LocalDate.parse(dataStr, formatter);
                        alunov1.setDataNascimento(dataNascimento);
                    } catch (DateTimeParseException e) {
                        System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
                    }

                    list.add(alunov1);


                    // Salvar arquivo em txt
                    try (FileWriter escritor = new FileWriter("ArquivosAlunos.txt", true);
                         BufferedWriter buffer = new BufferedWriter(escritor)) {

                        buffer.write(alunov1.toString());
                        buffer.newLine();

                        System.out.println("Registro criado e salvo com sucesso!");
                    } catch (IOException e) {
                        System.err.println("Erro ao salvar a lista: " + e.getMessage());
                    }

                    System.out.println("Parabéns! Seu cadastro foi concluído.");
                    break;

                case 2:
                    System.out.println("----- Lista de todos os Registros -----");
                    try {
                        FileReader leitor = new FileReader("ArquivosAlunos.txt");
                        BufferedReader lerArquivo = new BufferedReader(leitor);

                        String linha;
                        while ((linha = lerArquivo.readLine()) != null) {
                            System.out.println(linha);
                        }
                        lerArquivo.close();
                        leitor.close();

                    } catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo.");
                        e.printStackTrace();
                    }

                    break;

                case 3:
                    System.out.println("---- Buscar dados por Matrícula ----");
                    System.out.print("Informe a matrícula do aluno: ");
                    String buscaMatricula = scanner.nextLine();
                    boolean encontradoBusca = false;

                    for (AlunoAcademia aluno : list) {
                        if (aluno.getMatricula().equalsIgnoreCase(buscaMatricula)) {
                            System.out.println("Aluno encontrado:");
                            System.out.println(aluno);
                            encontradoBusca = true;
                            break;
                        }
                    }
                    if (!encontradoBusca) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("----- Editar registro -----");
                    System.out.print("Informe a matrícula do aluno que deseja editar: ");
                    String editarMatricula = scanner.nextLine();
                    boolean encontrado = false;

                    for (AlunoAcademia aluno : list) {
                        if (aluno.getMatricula().equalsIgnoreCase(editarMatricula)) {
                            encontrado = true;
                            System.out.println("Registro atual:");
                            System.out.println(aluno);

                            System.out.println("\n Qual campo deseja editar?");


                            System.out.println("Opções: nome, matricula, endereco, cidade, cpf, cep, telefone, rg, email, dataNascimento, sexo, planoAcademia");
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
                                    System.out.print("Digite a nova data de nascimento (dd/MM/yyyy): ");
                                    dataStr = scanner.nextLine();

                                    try {
                                        LocalDate dataNascimento = LocalDate.parse(dataStr, formatter);
                                        aluno.setDataNascimento(dataNascimento);
                                        System.out.println("Data de nascimento atualizada com sucesso!");
                                    } catch (DateTimeParseException e) {
                                        System.out.println("Data inválida. Use o formato dd/MM/yyyy.");
                                        System.out.println("Registro editado com sucesso!");
                                    }

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
                    break;

                case 5:
                    System.out.println("----- Excluir registro -----");
                    System.out.print("Informe a matrícula do aluno que deseja excluir: ");
                    String registroExcluir = scanner.nextLine();
                    Iterator<AlunoAcademia> iterator = list.iterator();
                    boolean removido = false;

                    while (iterator.hasNext()) {
                        AlunoAcademia aluno = iterator.next();
                        if (aluno.getMatricula().equalsIgnoreCase(registroExcluir)) {
                            iterator.remove();
                            System.out.println("Registro excluído com sucesso!");
                            removido = true;
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Registro não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }

        scanner.close();
    }

    // metodo ler entrada, para verificar se o usuario digitou alguma coisa

    public static String lerEntradaValida(Scanner scanner, String mensagem) {
        String entrada;
        do {
            System.out.print(mensagem);
            entrada = scanner.nextLine();
            if (entrada == null || entrada.trim().isEmpty()) {
                System.out.println("Entrada invalida, digite novamente um dado valido.");
            }
        } while (entrada == null || entrada.trim().isEmpty());
        return entrada;
    }
}
