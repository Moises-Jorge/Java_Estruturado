import java.util.Scanner;

public class Tabuada {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Integer num = 0;

        System.out.print("Digite um numero: ");
        num = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", num, i, (num * i));
        }
    }
}
