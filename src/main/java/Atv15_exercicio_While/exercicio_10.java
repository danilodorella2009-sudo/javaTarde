package Atv15_exercicio_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int falhas = 0;

        while (falhas < 5) {
            System.out.println("falhas detectadas: contagem " + (falhas + 1));
            falhas++;
        }
        System.out.println("Sistema desligado após " + falhas + " falhas consecutivas");
        sc.close();
    }
}
