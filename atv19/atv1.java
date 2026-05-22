package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");
        int n = sc.nextInt();
        System.out.println("notas");
        double[] nota = new double[n];
        for (int i = 0; i < n; i++) {
            nota[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += nota[i];
        }
        double media = soma / n;
        System.out.printf("A nota média de cada nota é: " + media);
        sc.close();
    }
}