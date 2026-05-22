package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        // Leitura dos números
        for (
                int i = 0;
                i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        // Contagem dos divisíveis por 3
        for (
                int i = 0;
                i < 10; i++) {
            if (numeros[i] % 3 == 0) {
                contador++;
            }
            // Exibição do resultado
            System.out.println("Quantidade de números divisíveis por 3: " + contador);
        }
    }
}


