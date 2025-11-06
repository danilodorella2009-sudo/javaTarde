package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[]{"sol", "nuvem", "lua", "astro"};
        for (String palavras : vect) {
            if (palavras.length() <= 4) {
                System.out.println(palavras);
            }
        }
    }
}
