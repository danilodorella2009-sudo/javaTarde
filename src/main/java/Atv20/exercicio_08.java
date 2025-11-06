package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de temperaturas que deseja saber: ");
        int n = sc.nextInt();
        double[] temperetura = new double[n];

        for (int i = 0; i < temperetura.length; i++) {
            System.out.println("temperatura " + (i + 1) + ": ");
            temperetura[i] = sc.nextInt();

            if (temperetura[i] >= 35) {
                System.out.println("Alerta!!");
            } else {
                System.out.println("Temperatura normal ");
            }
        }
        sc.close();
    }
}
