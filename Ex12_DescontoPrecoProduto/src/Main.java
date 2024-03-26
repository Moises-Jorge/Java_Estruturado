import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double preco = 0.0, novoPreco = 0.0;

        System.out.print("Informe o preco do produto: ");
        preco = input.nextDouble();

        novoPreco = preco - (preco * 0.05);

        System.out.format("\nO Novo Preco do Produto eh: %.2f kz\n\n", novoPreco);
    }
}
