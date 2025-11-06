package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número " + (i + 1) + " :");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Digite o número que deseja buscar: ");
        int busca = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                encontrado = true;
                break;

            }
        }
        if (encontrado) {
            System.out.println(" Número encontrado! ");
        } else {
            System.out.println("Número não encontrado! ");
        }

    }
}
