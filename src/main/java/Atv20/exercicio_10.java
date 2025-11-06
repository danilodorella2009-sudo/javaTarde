package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as pontuações dos jogadores separadas por espaço:");
        String linha = sc.nextLine();

        String[] partes = linha.split(" ");
        int[] pontuacoes = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            pontuacoes[i] = Integer.parseInt(partes[i]);
        }

        System.out.println("Pontuações dos jogadores: ");
        for (int p : pontuacoes) {
            System.out.println(p);
        }

        int destaques = 0;
        int precisaTreinar = 0;

        for (int p : pontuacoes) {
            if (p >= 100) {
                destaques++;
            } else if (p < 50) {
                precisaTreinar++;
            }
        }
        System.out.println("Destaques: " + destaques + " | Abaixo de 50: " + precisaTreinar);
        sc.close();
    }
}
