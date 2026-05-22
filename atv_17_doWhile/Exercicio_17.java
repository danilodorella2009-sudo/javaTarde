package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para contar leituras totais e leituras consecutivas abaixo de 2.5
        int totalLeituras = 0;
        int consecutivasBaixas = 0;
        //Declara variavel para armazenar o nivel de vibracao lido
        double nivel;
        //Estrutura de repeticao que continua ate obter 3 leituras consecutivas abaixo de 2.5
        do {
            //Solicita ao operador a leitura do nivel de vibracao
            System.out.print("Informe o nivel de vibracao (RMS): ");
            nivel = sc.nextDouble();
            //Incrementa o total de leituras
            totalLeituras++;
            //Verifica se a leitura esta abaixo de 2.5
            if (nivel < 2.5) {
                consecutivasBaixas++;
            } else {
                consecutivasBaixas = 0; //Reseta contador se leitura acima de 2.5
            }
            //Repete enquanto nao houver 3 leituras consecutivas abaixo de 2.5
        } while (consecutivasBaixas < 3);
        //Exibe o total de leituras realizadas
        System.out.println("Leituras totais: " + totalLeituras);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
