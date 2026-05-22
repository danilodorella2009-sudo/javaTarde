package atv15;

import java.util.Locale;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tempo inicial por peça (em segundos)");
        int tempo = sc.nextInt();

        System.out.println("Informe o numero total de peças");
        int totalPecas = sc.nextInt();

        System.out.println("Informe quanto o tempo diminui a cada ciclo (em segundos)");

        int reducao = sc.nextInt();

        int contador = 1;
        int tempoTotal = 0;

        while (contador <= totalPecas) {
            System.out.println("Peça " + contador + " produzida em " + tempo + " segundos");
            tempoTotal += tempo;

            tempo -= reducao;
            if (tempo < 0) {
                tempo = 0;
            }
            contador++;
        }
        System.out.println(" Tempo total de produção: " + tempoTotal + " segundos.");
        sc.close();

    }
}
