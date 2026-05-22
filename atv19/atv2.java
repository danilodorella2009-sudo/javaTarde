package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros que voce quer somar");
        int n = sc.nextInt();
        System.out.println("Numeros");
        int[] soma = new int[n];
        for (int i = 0; i < n; i++) {
            soma[i] = sc.nextInt();
        }
        int calculo = 0;
        for (int i = 0; i < n; i++) {
            calculo += soma[i];
        }
        int s = calculo;
        System.out.println("A soma de todos os numeros é: " + s);
        sc.close();
    }
}
