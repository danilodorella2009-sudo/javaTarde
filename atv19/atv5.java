package atv19;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] palavra = new String[5];
        int contador = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite as palavras " + (i+ 1) + ":");
            palavra[i] = sc.nextLine();
            if (palavra[i].length() >= 5) {
                contador++;
            }
        }
        System.out.println("O total de palavras mais de 5 sao: " + contador);
        sc.close();
    }
}
