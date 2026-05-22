package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {

        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para armazenar a soma total e a quantidade de ciclos
        int soma = 0;
        int ciclos = 0;
        //Estrutura de repeticao que continua ate atingir ou superar a meta de 120 pecas
        while (soma < 120) {
            //Solicita ao usuario o numero de pecas produzidas no ciclo atual
            System.out.print("Informe o numero de pecas produzidas: ");
            //Le o valor digitado e adiciona a soma total
            int pecas = sc.nextInt();
            soma += pecas;
            //Incrementa o contador de ciclos
            ciclos++;
        }
        //Exibe o total de ciclos realizados e a soma final de pecas
        System.out.println("Ciclos: " + ciclos + " | Total: " + soma);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
