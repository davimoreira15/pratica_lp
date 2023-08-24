import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a placa do carro: ");
        String placa = entrada.nextLine();

        System.out.print("Digite o ano de fabricação do carro: ");
        int anoFabricacao = entrada.nextInt();


        String situacaoCarro = "";
        if (anoFabricacao < 2010) {
            situacaoCarro = "Carro Velho";
        } else if (anoFabricacao >= 2011 && anoFabricacao <= 2021) {
            situacaoCarro = "Carro Semi novo";
        } else if (anoFabricacao == 2022) {
            situacaoCarro = "Carro Novo";
        }

        // Substituindo as vogais da placa por '*'

        String placaSubstituida = placa.replaceAll("[aeiouAEIOU]", "*");


        System.out.println("Situação do carro: " + situacaoCarro);
        System.out.println("Placa com vogais substituídas: " + placaSubstituida);


    }
}


