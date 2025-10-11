package Atv15_exercicio_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int falhas = 0;
        int pecas = 0;

        while (falhas < 50) {
            pecas += 200;
            falhas++;
            System.out.println("falhas n° " + falhas + " detectar após " + pecas + " pecas");
        }
        System.out.println("Total de falhas " + falhas + " em " + pecas + " peças verificadas");
        sc.close();
    }
}
