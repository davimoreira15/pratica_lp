import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem: ");
        double tempoViagem = entrada.nextDouble();

        System.out.print("Digite a velocidade média em km/h: ");
        double velocidadeMedia = entrada.nextDouble();

        System.out.print("Digite o consumo do veículo em km/h: ");
        double consumoVeiculo = entrada.nextDouble();

        double distanciaPercorrida = tempoViagem * velocidadeMedia;
        double consumoTotal = distanciaPercorrida / consumoVeiculo;

        System.out.println("Distância percorrida: " + distanciaPercorrida + " km");
        System.out.println("Consumo total de combustível: " + consumoTotal + " litros");




    }
}