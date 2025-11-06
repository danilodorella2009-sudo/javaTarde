package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Vetor original: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i]);
            if (i < 4) System.out.print(", ");
        }
        System.out.println("]");

        System.out.print("Vetor invertido: [");
        for (int i = 4; i >= 0; i--) {
            System.out.print(vetor[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
        sc.close();
    }
}
