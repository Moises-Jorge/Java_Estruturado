//import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // Criando o objecto de leitura (Global)
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String frase = "Curso em Video Python";

        System.out.println(frase);
        System.out.println(frase.substring(9,15));
        

        /* BUMBANDO COM ARRAY PURO
         String[] nomes = new String[4];

        for (int posicao = 0; posicao < nomes.length; posicao++) {
            System.out.format("Digite o %d nome: ", posicao + 1);
            nomes[posicao] = entrada.nextLine();
        }
        
        System.out.println();
        for (int posicao = 0; posicao < nomes.length; posicao++) {
            System.out.print(nomes[posicao] + " ");
        } */

        /* BUMBANDO COM ARRAY DE TAMANHO DINAMICO (ArrayList)
        ArrayList<String> lista_nomes = new ArrayList<>();
        String nome = "";

        System.out.println("Digite os nomes (Digite 'fim' para parar):");
        while (!(nome = entrada.nextLine()).equals("fim")) {
            lista_nomes.add(nome);
        }

        System.out.println("\nOs elementos da lista sao:");
        for (String name : lista_nomes) {
            System.out.println(name);
        }

        entrada.close(); */

        /* VARIAVEIS, TIPO DE DADOS E LEITURA 
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

        System.out.format("O seu nome eh %s tens %d anos de idade e pesas %.2f kg e te descreve como sendo alguem %s\n", nome, idade, peso, descricao); */
    }
}
