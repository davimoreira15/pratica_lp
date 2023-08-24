import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        int contadorVogais = 0;


        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("O número de vogais na frase é: " + contadorVogais);



    }
}
