import java.util.Scanner;

public class DobroTriploRaiz {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Integer num = 0, dobro = 0, triplo = 0;
        double raizQ = 0;
        
        System.out.print("Digite um numero: ");
        num = input.nextInt();

        dobro = num * 2;
        triplo = num * 3;
        raizQ = Math.sqrt(num);

        System.out.format("\nDobro de %d = %d\nTriplo de %d = %d\nRaizQ de %d = %.2f\n\n", num, dobro, num, triplo, num, raizQ);
    }
}
