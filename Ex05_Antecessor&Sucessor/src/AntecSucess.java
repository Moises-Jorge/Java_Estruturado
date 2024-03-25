import java.util.Scanner;

public class AntecSucess {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Integer num = 0, antecessor = 0, sucessor = 0;
        String aux_input = "";

        System.out.print("Digite um numero: ");
        aux_input = input.nextLine();
        num = Integer.parseInt(aux_input);

        antecessor = num - 1;
        sucessor = num + 1;

        System.out.format("\nAntecessor de %d = %d\nSucessor de %d = %d\n\n", num, antecessor, num, sucessor);
    }
}
