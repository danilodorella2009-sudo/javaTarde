package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para armazenar o total de consumo e o numero de turnos
        int total = 0;
        int turnos = 0;
        //Declara variavel para armazenar o consumo do turno atual
        int consumo;
        //Estrutura de repeticao que continua ate o operador digitar 0
        do {
            //Solicita ao operador o consumo do turno
            System.out.print("Informe o consumo do turno (kWh, 0 para encerrar): ");
            //Le o valor digitado
            consumo = sc.nextInt();
            //Verifica se o valor e diferente de 0 para contabilizar
            if (consumo != 0) {
                total += consumo; //Adiciona ao total
                turnos++;         //Incrementa o numero de turnos
            }
            //Repete enquanto o consumo for diferente de 0
        } while (consumo != 0);
        //Calcula a media por turno
        double media = turnos > 0 ? (double) total / turnos : 0;
        //Exibe o total e a media
        System.out.println("Total: " + total + " | Media: " + media);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
