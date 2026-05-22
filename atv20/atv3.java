package atv20;

import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos preços serao digitados?");
        int n = sc.nextInt();
        double[] precos = new double[n];
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Digite o preço #" + (i + 1) + ":");
            precos[i] = sc.nextDouble();
        }
        double soma = 0.0;
        System.out.println("\nPreços digitados:");
        for (double p : precos) {
            System.out.println(p);
            soma += p;
        }
        double media = soma / precos.length;
        System.out.println("\nMédia = " + media);
        sc.close();
    }
}
