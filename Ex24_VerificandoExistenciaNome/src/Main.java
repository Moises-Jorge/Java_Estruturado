import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nome_completo;

        System.out.print("Digite seu nome completo: ");
        nome_completo = input.nextLine().strip().toUpperCase();

        System.out.println(nome_completo.contains("SILVA"));
    }
}
