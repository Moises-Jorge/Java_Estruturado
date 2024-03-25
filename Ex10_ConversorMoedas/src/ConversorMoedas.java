import java.util.Scanner;

public class ConversorMoedas {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double kwanza = 0.0, dolar = 0.0;

        System.out.print("Quanto tens?: ");
        kwanza = input.nextDouble();

        dolar = kwanza * 0.0012;

        System.out.format("\n%.2f kz = $%.4f\n\n", kwanza, dolar);
    }
}
