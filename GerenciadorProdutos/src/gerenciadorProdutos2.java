import java.util.Scanner;
import java.util.ArrayList;

public class gerenciadorProdutos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao;
        int proximoId = 1;

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
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    proximoId = cadastrarProduto(scanner, produtos, proximoId);
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

        scanner.close();
    }

    // Método para cadastrar produto
    public static int cadastrarProduto(Scanner scanner, ArrayList<Produto> produtos, int idAtual) {
        System.out.println("------------------------");
        System.out.println(" CADASTRO DE PRODUTO ");
        System.out.println("------------------------");
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 

        Produto novo = new Produto(idAtual, nome, preco);
        produtos.add(novo);

        System.out.println("Produto cadastrado com sucesso! ID: " + idAtual);

        return idAtual + 1;
    }

    static class Produto {
        int id;
        String nome;
        double preco;

        public Produto(int id, String nome, double preco) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
        }

        public String toString() {
            return "ID: " + id + " | Nome: " + nome + " | Preço: R$ " + preco;
        }
    }
}
