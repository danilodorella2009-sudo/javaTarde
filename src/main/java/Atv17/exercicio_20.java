package Atv17;

import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecas, falhas, totalPecas = 0, totalFalhas = 0;
        double taxa;

        do {
            System.out.print("Informe o número de peças no ciclo: ");
            pecas = sc.nextInt();
            System.out.print("Informe o número de falhas no ciclo: ");
            falhas = sc.nextInt();
            totalPecas += pecas;
            totalFalhas += falhas;
            taxa = ((double) totalFalhas / totalPecas) * 100;
            System.out.printf("Taxa atual: " + taxa);
        } while (taxa > 2.0);
        System.out.printf("Taxa final: " + taxa);
        sc.close();
    }
}
