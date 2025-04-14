import java.util.Scanner;

public class gerenciadorProdutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---------------------------------");
            System.out.println(" MENU DO GERENCIADOR DE PRODUTOS ");
            System.out.println("---------------------------------");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Alterar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu: Cadastrar Produto");
                    break;
                case 2:
                    System.out.println("Você escolheu: Listar Produtos");
                    break;
                case 3:
                    System.out.println("Você escolheu: Alterar Produto");
                    break;
                case 4:
                    System.out.println("Você escolheu: Excluir Produto");
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();

        } while (opcao != 5);
        }
    }