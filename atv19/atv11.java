package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;

        // Leitura das idades
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
            idades[i] = sc.nextInt();
            soma += idades[i];
        }

        // Cálculo da média
        double media = soma / 5.0;

        // Exibição da média
        System.out.println("Média das idades: " + media);

        sc.close();
    }
}


