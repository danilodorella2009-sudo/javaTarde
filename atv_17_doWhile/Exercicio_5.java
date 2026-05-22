package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para armazenar o peso total e o numero de pecas
        int pesoTotal = 0;
        int pecas = 0;
        //Estrutura de repeticao que executa pelo menos uma vez
        do {
            //Solicita ao usuario o peso da peca atual
            System.out.print("Informe o peso da peca (em g): ");
            //Le o valor digitado e adiciona ao peso total
            int peso = sc.nextInt();
            pesoTotal += peso;
            //Incrementa o contador de pecas
            pecas++;
            //Repete enquanto o peso total for menor que 500 gramas
        } while (pesoTotal < 500);
        //Exibe o total de pecas e o peso final do lote
        System.out.println("Pecas: " + pecas + " | Peso total: " + pesoTotal + " g");
        //Fecha o Scanner para liberar recursos
        sc.close();

    }
}
