package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros deseja");
        int n = sc.nextInt();
        int positivos = 0, negativos = 0;
        int[] separacao = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + i + " numero:");
            separacao[i] = sc.nextInt();

            if (separacao[i] > 0) {
                positivos++;

            } else {
                negativos++;
            }
        }
        System.out.println("Total de positivos: " + positivos + "\n Total de negativos: " + negativos);
        sc.close();
    }
}
