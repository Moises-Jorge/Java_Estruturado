import java.util.Scanner;

public class MediaAluno {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double nota1 = 0, nota2 = 0, media = 0;

        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.format("\nMeida Final = %.2f\n\n", media);
    }
}
