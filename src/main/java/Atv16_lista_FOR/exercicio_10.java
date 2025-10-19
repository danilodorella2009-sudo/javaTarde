package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota minima para aprovação: ");
        int n1 = sc.nextInt();
        System.out.println("Quantos testes de qualidade você quer registrar: ");
        int quantitade = sc.nextInt();
        int aprovado = 0;
        for (int i = 1; i <= quantitade; i++) {
            System.out.println("Resultados do teste: " + i + ": ");
            int resultado = sc.nextInt();
            if (resultado >= n1) {
                aprovado++;

            }
        }
        double Ap = ((double) aprovado / quantitade) * 100;
        System.out.println("Total de embalagens testadas: " + quantitade);
        System.out.println("Total de embalagens aprovadas: " + aprovado);
        System.out.printf("Porcentagem de embalagens aprovadas: %.2f%%" + Ap);
        sc.close();
    }
}
