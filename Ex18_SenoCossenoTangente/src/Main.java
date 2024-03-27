import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double angulo = 0.0, seno = 0.0, cosseno = 0.0, tangente = 0.0;

        System.out.print("Informe o angulo: ");
        angulo = input.nextDouble();

        seno = Math.sin(angulo);
        cosseno = Math.cos(angulo);
        tangente = Math.tan(angulo);

        System.out.format("\nSeno de %.2f = %.2f\nCosseno de %.2f = %.2f\nTangente de %.2f = %.2f\n\n", angulo, seno, angulo, cosseno, angulo, tangente);
    }
}
