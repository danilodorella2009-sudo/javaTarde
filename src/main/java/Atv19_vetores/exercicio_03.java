package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[8];
        int positivos = 0, negativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite os números " + (i + 1) + " :");
            numeros[i] = sc.nextDouble();

            if (numeros[i] >= 0) {
                positivos++;
            } else {
                negativos++;
            }
            System.out.println("Quantidade de positivos: " + positivos);
            System.out.println("Quantidade de negativos: " + negativos);
        }
    }
}