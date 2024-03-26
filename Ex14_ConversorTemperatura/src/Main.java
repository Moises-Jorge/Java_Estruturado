import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double grauC = 0.0, grauF = 0.0;

        System.out.print("Digite a temperatura em grau Celsius: ");
        grauC = input.nextDouble();

        grauF = (grauC * 1.8) + 32;

        System.out.format("\n%.2f C = %.2f F\n\n", grauC, grauF);
    }
}
