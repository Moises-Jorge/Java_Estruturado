import java.util.Scanner;

public class ConversorComprimento {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double m = 0.0, cm = 0.0, mm = 0.0;

        System.out.print("Digite o valor em metros: ");
        m = input.nextDouble();

        cm = m * 100;
        mm = m * 1000;

        System.out.format("\n%.2f m = %.2f cm\n%.2f m = %.2f mm\n\n", m, cm, m, mm);
    }
}
