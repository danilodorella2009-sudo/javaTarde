package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 3 ==0) {
                contador++;
            }

            System.out.println("Quantidade de números divisíveis por 3: " + contador);
        }
    }
}
