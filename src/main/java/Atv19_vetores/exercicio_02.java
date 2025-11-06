package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite os números " + (i + 1) + " :");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }
        System.out.println("A soma dos números é: " + soma);
        sc.close();
    }
}
