package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara a variavel para armazenar a umidade lida
        int umidade;
        //Estrutura de repeticao que continua ate a umidade estar no intervalo [30, 55]
        do {
            //Solicita ao operador que informe a umidade
            System.out.print("Informe a umidade (%): ");
            umidade = sc.nextInt();
            //Verifica se a umidade esta fora do intervalo permitido
            if (umidade < 30 || umidade > 55) {
                System.out.println("Umidade fora do intervalo! Tente novamente.\n");
            }
            //Repete enquanto a umidade for menor que 30 ou maior que 55
        } while (umidade < 30 || umidade > 55);
        //Exibe a umidade aceita
        System.out.println("Umidade aceita: " + umidade + "%");
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
