import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double km_percorrido = 0.0, preco = 0.0;
        Integer tot_dias = 0;

        System.out.print("Quantos Km o carro percorreu?: ");
        km_percorrido = input.nextDouble();

        System.out.print("Por quantos dias?: ");
        tot_dias = input.nextInt();

        preco = (km_percorrido * 0.15) + (tot_dias * 60);

        System.out.format("\nO preco total a pagar pelo aluguel do carro eh: %.2f kz\n\n", preco);
    }
}
