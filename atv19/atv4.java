package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce deseja");
        int n = sc.nextInt();
        int maior = 0, menor = 0;
        int[] separacao = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + i + " numero");
            separacao[i] = sc.nextInt();

            if (separacao[i] == 0) {
                maior = separacao[i];
                menor = separacao[i];
            } else {
                if (separacao[i] > maior) {
                    maior = separacao[i];
                }
                if (separacao[i] < menor) {
                    menor = separacao[i];
                }
            }
        }
        System.out.println("numero maior: " + maior + "\nnumero menor: " + menor);
    }
}
