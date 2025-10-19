package Desafios_de_programação_logica;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("Por favor, insira apenas números inteiros positivos!");
        } else {
            int resto;
            while (b != 0) {
                resto = a % b;
                a = b;
                b = resto;
            }
            System.out.println(" O Máximo Divisor Comum é: " + a);
        }
        sc.close();
    }
}
