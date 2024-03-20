import java.util.Scanner;

public class App {
    // Criando o objecto de leitura (Global)
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        String nome, descricao, aux;
        Integer idade;
        Double peso;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite o sua idade: ");
        aux = entrada.nextLine();
        idade = Integer.parseInt(aux);

        System.out.print("Digite o seu peso: ");
        aux = entrada.nextLine();
        peso = Double.parseDouble(aux);

        System.out.print("Como te descreves?: ");
        descricao = entrada.nextLine();

        System.out.format("O seu nome eh %s tens %d anos de idade e pesas %.2f kg e te descreve como sendo alguem %s\n", nome, idade, peso, descricao);
    }
}
