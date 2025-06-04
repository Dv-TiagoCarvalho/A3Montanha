
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = "ArquivosAlunos.txt";
        ArrayList<AlunoAcademia> list = SistemaAcademia.carregarAlunos(caminhoArquivo);

        boolean continuar = true;

        System.out.println("----- Academia TechFit -----");
        while (continuar) {
            System.out.println("\nEscolha a opção que deseja usar: ");
            System.out.println(" 1 - Criar novo registro"
                    + "\n 2 - Listar todos os Registros"
                    + "\n 3 - Buscar registro por matrícula"
                    + "\n 4 - Editar registro"
                    + "\n 5 - Excluir registro"
                    + "\n 6 - Sair");

            System.out.print("Opção: ");
            int opcao;
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
                continue;
            }
            continuar = SistemaAcademia.executarOpcao(opcao, list, caminhoArquivo, scanner);
        }
    }
}
