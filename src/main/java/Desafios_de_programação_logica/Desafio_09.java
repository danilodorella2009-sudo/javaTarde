package Desafios_de_programação_logica;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        if (numero <= 1) {
            System.out.println("Digite um número maior que 1.");
        } else {
            System.out.print("Fatores primos de " + numero + ": ");
            int divisor = 2;
            boolean primeiro = true;
            while (numero > 1) {
                int potencia = 0;
                while (numero % divisor == 0) {
                    numero /= divisor;
                    potencia++;
                }
                if (potencia > 0) {
                    if (!primeiro) {
                        System.out.print(" * ");
                    }
                    System.out.print(divisor + "^" + potencia);
                    primeiro = false;
                }
                divisor++;
            }
            System.out.println();
        }
        sc.close();
    }
}
