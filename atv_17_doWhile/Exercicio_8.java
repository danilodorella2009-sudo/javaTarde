package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para armazenar o total de caixas entregues e o numero de viagens
        int totalCaixas = 0;
        int viagens = 0;
        //Estrutura de repeticao que continua ate atingir 50 caixas
        do {
            //Solicita ao operador o numero de caixas entregues na viagem atual
            System.out.print("Informe o numero de caixas entregues: ");
            //Le o valor digitado
            int caixas = sc.nextInt();
            //Soma ao total de caixas
            totalCaixas += caixas;
            //Incrementa o numero de viagens
            viagens++;
            //Repete enquanto o total de caixas for menor que 50
        } while (totalCaixas < 50);
        //Exibe o numero de viagens realizadas e o total de caixas entregues
        System.out.println("Viagens: " + viagens + " | Caixas: " + totalCaixas);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
