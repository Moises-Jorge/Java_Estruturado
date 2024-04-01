import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nome_completo, nome_sem_espaco;
        String[] divisao_nome;

        System.out.print("Digite seu nome completo: ");
        nome_completo = input.nextLine();

        nome_sem_espaco = nome_completo.replaceAll("\\s", "");
        divisao_nome = nome_completo.split(" ");

        
        System.out.println("\n" + nome_completo.toUpperCase());
        System.out.println(nome_completo.toLowerCase());
        System.out.println(nome_completo.length()); // Pega o tamanho original da String (com os espacos)
        System.out.println(nome_sem_espaco.length()); // Pegam o tamanho da String, mas sem contar os espacos
        System.out.println(divisao_nome[0].length()); // Pega apenas o tamanho do Primeiro Nome

        System.out.println();
    }
}
