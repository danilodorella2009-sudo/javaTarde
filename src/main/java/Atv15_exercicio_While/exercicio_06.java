package Atv15_exercicio_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int peca = 1;
        int tempo = 60;
        int totalTempo = 0;

        while (peca <= 10) {

            if (tempo < 10) {
                tempo = 10;
            }
            System.out.println("peça " + peca + " levou " + tempo + " segundos");
            totalTempo += tempo;
            tempo -= 10;
            peca++;
        }
        System.out.println("Tempo total gasto: " + totalTempo + " segundos");
        sc.close();
    }
}
