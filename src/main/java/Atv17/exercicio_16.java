package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int aprovados = 0, reprovados = 0, contador = 0;

        System.out.println("Digite o resultado das 10 amostras (A = Aprovado, R = Reprovado):");
        do {
            System.out.print("Amostra " + (contador + 1) + ": ");
            String entrada = sc.next().toUpperCase();
            if (entrada.equals("A")) {
                aprovados++;
                contador++;
            } else if (entrada.equals("R")) {
                reprovados++;
                contador++;
            } else {
                System.out.println("Valor inválido! Digite apenas A ou R.");
            }
        } while (contador < 10);
        System.out.println("A: " + aprovados + " | R: " + reprovados);
        sc.close();
    }
}
