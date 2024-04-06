import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Integer num = 0, d = 0, c = 0, m = 0, u = 0;

        System.out.print("Digite um numero entre [0 - 9999]: ");
        num = input.nextInt();

        u = num/1%10;
        d = num/10%10;
        c = num/100%10;
        m = num/1000%10;

        System.out.println("Unidade: " + u);
        System.out.println("Dezena: " + d);
        System.out.println("Centena: " + c);
        System.out.println("Milhar: " + m);
    }
}
