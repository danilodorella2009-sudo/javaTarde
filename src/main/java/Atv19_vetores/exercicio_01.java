package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as notas " + (i + 1) + " :");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.println("Média das notas: " + media);
        sc.close();
    }
}

