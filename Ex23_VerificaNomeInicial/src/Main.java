import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String city_name;
        String[] div_name;

        System.out.print("Digite o nome de uma cidade: ");
        city_name = input.nextLine().strip();

        div_name = city_name.split(" ");

        System.out.println(div_name[0].equalsIgnoreCase("santo"));
    }
}
