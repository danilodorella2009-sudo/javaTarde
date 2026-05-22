package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("      TABUADA DE 1 A 10");
        System.out.println("----------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        sc.close();
    }
}
