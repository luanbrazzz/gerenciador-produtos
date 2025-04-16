import java.util.Scanner;
import java.util.ArrayList;

public class gerenciadorProdutos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao;
        int proximoId = +1;

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
                    listarProdutos(produtos);
                    break;
                case 3:
                    alterarProduto(scanner, produtos);
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

        System.out.println("Produto cadastrado com sucesso!");

        return idAtual + 1;

    }

    // Listagem dos produtos
    public static void listarProdutos(ArrayList<Produto> produtos) {
        System.out.println("------------------------");
        System.out.println(" LISTA DE PRODUTOS ");
        System.out.println("------------------------");

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    public static void alterarProduto(Scanner scanner, ArrayList<Produto> produtos) {
        System.out.println("------------------------");
        System.out.println(" ALTERAR PRODUTO ");
        System.out.println("------------------------");

        System.out.print("Digite o ID do produto que deseja alterar: ");
        int idBusca = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;

        for (Produto p : produtos) {
            if (p.id == idBusca) {
                System.out.print("Novo nome do produto (atual: " + p.nome + "): ");
                String novoNome = scanner.nextLine();

                System.out.print("Novo preço do produto (atual: R$ " + p.preco + "): ");
                double novoPreco = scanner.nextDouble();
                scanner.nextLine();

                p.nome = novoNome;
                p.preco = novoPreco;

                System.out.println("Produto alterado com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto com ID " + idBusca + " não encontrado.");
        }
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
            return "Nome: " + nome + " | Preço: R$ " + preco;
        }
    }
}