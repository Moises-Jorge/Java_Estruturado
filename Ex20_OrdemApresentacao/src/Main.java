import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String[] nomes = new String[4];
        ArrayList<String> lista_nomes;

        //Lendo os nomes
        for (int posicao = 0; posicao < nomes.length; posicao++) {
            System.out.format("Digite o %d nome: ", posicao + 1);
            nomes[posicao] = input.nextLine();
        }

        // Convertendo o Array em Lista
        lista_nomes = new ArrayList<>(Arrays.asList(nomes));

        // Imprimindo a lista na ordem certa
        System.out.println("\nOrdem original da lista:");
        for (String nome : lista_nomes) {
            System.out.print(nome + " ");
        }

        // Embaralhando a lista
        Collections.shuffle(lista_nomes);

        // Imprimindo a lista na embaralhada
        System.out.println("\n\nA ordem de apresnetacao:");
        for (String nome : lista_nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();
    }
}
