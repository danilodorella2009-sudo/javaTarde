package Desafios_de_programacao_logica;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("======= TABUADA DE 1 A 10 =======\n");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.printf("%4d", resultado);
            }
            System.out.println();
        }
        sc.close();
    }
}
