package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número para posição: ");
            vetor[i]= sc.nextInt();
        }
        System.out.print("Vetor preenchido: [");
        for (int i=0; i< vetor.length; i++) {
            System.out.println(vetor[i]);
            if (i < vetor.length-1) {
                System.out.print(",");
                System.out.print("]");
            }

        }
        sc.close();
    }
}
