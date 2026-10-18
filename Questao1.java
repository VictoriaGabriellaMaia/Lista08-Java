import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getSubtotal() {
        return quantidade * preco;
    }
}

class Pedido {
    private List<Produto> produtos = new ArrayList<>();

    public void inserirProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getSubtotal();
        }
        return total;
    }
}

public class MainPedido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        System.out.print("Quantos produtos deseja inserir no pedido? ");
        int totalProdutos = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        for (int i = 1; i <= totalProdutos; i++) {
            System.out.println("\nProduto " + i + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            System.out.print("Preço unitário: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir quebra de linha

            pedido.inserirProduto(new Produto(nome, quantidade, preco));
        }

        System.out.println("\nTotal do pedido: R$ " + pedido.calcularTotal());
        scanner.close();
    }
}
