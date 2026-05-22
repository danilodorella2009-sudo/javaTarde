package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara a variavel para armazenar a leitura do sensor
        double valor;
        //Estrutura de repeticao que continua ate a leitura estar entre 4.0 e 20.0
        do {
            //Solicita ao operador que informe a leitura do sensor
            System.out.print("Informe a leitura do sensor (mA): ");
            valor = sc.nextDouble();
            //Verifica se a leitura esta fora da faixa aceitavel
            if (valor < 4.0 || valor > 20.0) {
                System.out.println("Valor fora da faixa! Tente novamente.\n");
            }
            //Repete enquanto o valor for menor que 4.0 ou maior que 20.0
        } while (valor < 4.0 || valor > 20.0);
        //Exibe mensagem indicando que a calibracao esta ok
        System.out.println("Calibracao OK: " + valor + " mA");
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
