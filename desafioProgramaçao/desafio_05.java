package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int espaco = i; espaco < n; espaco++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
