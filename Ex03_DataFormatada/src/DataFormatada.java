import java.util.Scanner;

public class DataFormatada {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Integer dia = 0, ano = 0;
        String mes = "", aux = "";

        System.out.print("Dia: ");
        aux = input.nextLine();
        dia = Integer.parseInt(aux);

        System.out.print("Mes: ");
        mes = input.nextLine();

        System.out.print("Ano: ");
        aux = input.nextLine();
        ano = Integer.parseInt(aux);

        System.out.format("\nOla! Voce nasceu no dia %d/%s/%d\n", dia, mes, ano);
    }
}
