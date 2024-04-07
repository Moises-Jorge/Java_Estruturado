import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nome_completo;
        String[] div_nome;

        System.out.print("Digite seu nome completo: ");
        nome_completo = input.nextLine().strip();

        div_nome = nome_completo.split(" ");

        System.out.println("\nPrimeiro Nome: " + div_nome[0]);
        System.out.println("Ultimo Nome: " + div_nome[div_nome.length - 1]);
    }
}
