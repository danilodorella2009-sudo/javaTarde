package atv20;

import java.util.Locale;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pontuações serão digitadas? ");
        int n = sc.nextInt();

        int[] pontuacoes = new int[n];

        for (int i = 0; i < pontuacoes.length; i++) {
            System.out.println("Digite a pontução do jogador #" + (i + 1) + ":");
            pontuacoes[i] = sc.nextInt();
        }
        int destaques = 0;
        int abaixo50 = 0;
        System.out.println("\nPontuações dos jogadores:");
        for (int p : pontuacoes) {
            System.out.println(p);
            if (p >= 100) {
                destaques++;
            } else if (p < 50) {
                abaixo50++;
            }
        }
        System.out.println("\nDestaques: " + destaques + " |  Abaixo de 50: " + abaixo50);
        sc.close();
    }
}
