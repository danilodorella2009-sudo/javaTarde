package atv20;

import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas notas serao digitadas");
        int n = sc.nextInt();
        int[] notas = new int[n];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota #" + (i + 1) + ":");
            notas[i] = sc.nextInt();
        }
        System.out.println("\nSituação dos alunos");
        for (int nota : notas) {
            if (nota >= 60) {
                System.out.println(nota + " Aprovado");
            } else {
                System.out.println(" Reforço");
            }
            sc.close();
        }
    }
}

