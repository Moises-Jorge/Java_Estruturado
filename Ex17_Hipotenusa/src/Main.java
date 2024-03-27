import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double cat_oposto = 0.0, cat_adjacente = 0.0, hipotenusa = 0.0;

        System.out.print("Cateto Oposto: ");
        cat_oposto = input.nextDouble();

        System.out.print("Cateto Adjacente: ");
        cat_adjacente = input.nextDouble();

        hipotenusa = Math.hypot(cat_oposto, cat_adjacente);

        System.out.format("\nHipotenusa = %.2f cm\n\n", hipotenusa);
    }
}
