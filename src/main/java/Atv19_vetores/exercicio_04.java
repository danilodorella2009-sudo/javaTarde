package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite os numeros " + (i + 1) + " :");
            numeros[i] = sc.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                maior = numeros[i];
                menor = numeros[i];
            } else {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                }
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor número: " + menor);
        sc.close();
    }
}
