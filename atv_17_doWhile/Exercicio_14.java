package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para contar ocorrencias de cada defeito
        int d01 = 0;
        int d02 = 0;
        int d03 = 0;
        //Declara a variavel para armazenar o codigo informado
        String codigo;
        //Estrutura de repeticao que continua ate o operador digitar "FIM"
        do {
            //Solicita ao operador que informe o codigo do defeito
            System.out.print("Informe o codigo do defeito (D01, D02, D03) ou FIM para encerrar: ");
            codigo = sc.nextLine();
            //Verifica qual defeito foi informado e incrementa o contador correspondente
            if (codigo.equalsIgnoreCase("D01")) {
                d01++;
            } else if (codigo.equalsIgnoreCase("D02")) {
                d02++;
            } else if (codigo.equalsIgnoreCase("D03")) {
                d03++;
            } else if (!codigo.equalsIgnoreCase("FIM")) {
                System.out.println("Codigo invalido! Tente novamente.\n");
            }
            //Repete enquanto a entrada for diferente de "FIM"
        } while (!codigo.equalsIgnoreCase("FIM"));
        //Exibe a contagem final de cada defeito
        System.out.println("D01: " + d01 + " | D02: " + d02 + " | D03: " + d03);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
