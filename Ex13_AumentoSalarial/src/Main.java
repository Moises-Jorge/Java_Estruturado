import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double salario = 0.0, novo_salario = 0.0;

        System.out.print("Informe o seu salario: ");
        salario = input.nextDouble();

        novo_salario = salario + (salario * 0.15);

        System.out.format("\nSeu novo salario eh: %.2f kz\n\n", novo_salario);
    }
}
