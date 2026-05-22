package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        // Preenchendo o vetor
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        // Verificando se é par ou ímpar
        System.out.println("Resultados:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " é Par");
            } else {
                System.out.println(numeros[i] + " é Ímpar");
            }
        }
        sc.close();
    }
}


