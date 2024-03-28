import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // Declarando o Array e a Lista pela qual o Array sera convertida depois.
        String[] nomes = new String[4];
        ArrayList<String> lista_nomes;
        Random random = new Random(); // Declarando o objecto randomizador
        Integer indiceSorteado = 0;
        String nomeSorteado = "";

        // Lendo os valores do Array
        for (int posicao = 0; posicao < nomes.length; posicao++) {
            System.out.format("Digite o %dº nome: ", posicao + 1);
            nomes[posicao] = input.nextLine();
        }

        // Convertendo o Array em Lista
        lista_nomes = new ArrayList<>(Arrays.asList(nomes));

        // Sorteando um indice da lista para posteriormente pegar o nome que estiver naquela posicao
        indiceSorteado = random.nextInt(lista_nomes.size());

        // Pegando agora o nome que se encontra na posicao do indiceSorteado (esse elemento eh que sera o nome sorteado)
        nomeSorteado = lista_nomes.get(indiceSorteado);

        // Imprimindo o Nome que foi escolhido
        System.out.format("\nO nome escolhido para apagar o quadro eh: %s\n\n", nomeSorteado);

        /* // Imprimindo os elementos da lista
        System.out.println("\nOs elementos da lista sao:");
        for (String nome : lista_nomes) {
            System.out.print(nome + " ");    
        } */
    }
}
