import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String frase;
        Integer contador = 0;
        
        System.out.print("Digite uma frase: ");
        frase = input.nextLine().strip().toUpperCase();

        // Contando os caracteres
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'A') {
                contador ++;
            }
        }
    
        System.out.println("\nA letra 'A' aparece " + contador + " vezes na frase " + frase);
        System.out.println("A primeira vez que aparece eh na posicao " + frase.indexOf('A'));
        System.out.println("A ultima vez que aparece eh na posicao " + frase.lastIndexOf('A'));
    }
}
