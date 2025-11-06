package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] palavras = new String[5];
        int contador = 0;

        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Digite a palavra " + (i + 1) + " :");
            palavras[i] = sc.nextLine();

        }
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() >= 5) {
                contador++;
            }
        }
        System.out.println("Quantidade de palavras com mais de 5 caracteres: " + contador);
        sc.close();
    }
}
