package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite quantos alunos deseja saber a nota: ");
        int n = sc.nextInt();

        int[] notas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a nota dos aluno: " + (i + 1) + " :");
            notas[i] = sc.nextInt();

            if (notas[i] >= 60) {
                System.out.println("Aprovado ");
            } else {
                System.out.println("Reforço ");
            }
        }
        sc.close();
    }
}