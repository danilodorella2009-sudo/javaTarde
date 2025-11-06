package Atv19_vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            idades[i] = sc.nextInt();
            soma += idades[i];
        }


        double media = soma / 5.0;


        System.out.println("Média das idades: " + media);

        sc.close();
    }
}
