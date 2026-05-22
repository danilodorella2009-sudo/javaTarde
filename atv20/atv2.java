package atv20;

import java.util.Locale;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva as palavras ate 4 letras");
        String palavras = sc.nextLine();
        String[] vect = palavras.split(" ");
        for (String p : vect) {
            if (p.length() <= 4) {
                System.out.println(p);
                sc.close();
            }
        }
    }
}
