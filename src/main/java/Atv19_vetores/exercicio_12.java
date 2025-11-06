package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        numeros[2] = 0;

        System.out.print("Vetor alterado: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]);
            if (i < 4) System.out.print(", ");
        }
        System.out.println("]");
        sc.close();
    }
}
