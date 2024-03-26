import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Double largura = 0.0, altura = 0.0, area = 0.0, qtd_tinta = 0.0;

        System.out.print("Informe a largura da parede: ");
        largura = input.nextDouble();

        System.out.print("Informe a altura da parede: ");
        altura = input.nextDouble();

        area = largura * altura;
        qtd_tinta = area / 2;

        System.out.format("\nArea da parede = %.2f m\nQtd de tinta necessaria: %.2f L\n\n", area, qtd_tinta);
    }
}
