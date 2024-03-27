import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double num = 0.0;
        Integer parte_inteira = 0;

        System.out.print("Informe um numero real: ");
        num = input.nextDouble();

        parte_inteira = num.intValue();
        //parte_inteira = (int) Math.floor(num);

        System.out.format("\nA parte inteira de %.2f eh %d\n\n", num, parte_inteira);
    }
}
