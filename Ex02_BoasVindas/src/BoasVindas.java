import java.util.Scanner;

public class BoasVindas {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nome;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.format("Bem-vindo ao Java %s", nome);
    }
}
