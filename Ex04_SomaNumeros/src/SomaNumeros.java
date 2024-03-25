import java.util.Scanner;

public class SomaNumeros {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Integer n1 = 0, n2 = 0, soma = 0;
        String aux = "";

        System.out.print("Digite o primeiro numero: ");
        aux = input.nextLine();
        n1 = Integer.parseInt(aux);

        System.out.print("Digite o segundo numero: ");
        aux = input.nextLine();
        n2 = Integer.parseInt(aux);

        soma = n1 + n2;

        System.out.format("\n%d + %d = %d\n\n", n1, n2, soma);
    }
}
