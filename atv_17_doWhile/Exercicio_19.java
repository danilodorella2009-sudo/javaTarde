package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para armazenar total de pecas, total de falhas e taxa de falhas
        int totalPecas = 0;
        int totalFalhas = 0;
        double taxa = 100.0;
        //Estrutura de repeticao que garante pelo menos um ciclo
        do {
            //Solicita ao operador o numero de pecas do ciclo
            System.out.print("Informe o numero de pecas do ciclo: ");
            int pecasCiclo = sc.nextInt();
            //Solicita ao operador o numero de falhas do ciclo
            System.out.print("Informe o numero de falhas do ciclo: ");
            int falhasCiclo = sc.nextInt();
            //Atualiza os totais acumulados
            totalPecas += pecasCiclo;
            totalFalhas += falhasCiclo;
            //Calcula a taxa cumulativa de falhas
            taxa = (double) totalFalhas / totalPecas * 100;
            //Exibe a taxa atual para acompanhamento (opcional)
            System.out.printf("Taxa atual: %.2f%%\n\n", taxa);
            //Repete enquanto a taxa de falhas for maior que 2%
        } while (taxa > 2.0);
        //Exibe a taxa final arredondada
        System.out.printf("Taxa final: %.0f%%%n", taxa);
        //Fecha o Scanner para liberar recursos
        sc.close();

    }
}
