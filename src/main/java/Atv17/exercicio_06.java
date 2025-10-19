package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String resultado;
        int aprovados = 0, reprovados = 0;
        do {
            System.out.println("Resultados de inspeção visual. ");
            System.out.println("Digite A (aprovado), R (reprovado) ou Fim para encerrar: ");
            resultado = sc.next();
            if (resultado.equalsIgnoreCase("A")) {
                aprovados++;
            } else if (resultado.equalsIgnoreCase("R")) {
                reprovados++;
            }
        } while (resultado.equalsIgnoreCase("Fim"));
        System.out.println("Aprovados: " + aprovados + " Reprovados: " + reprovados);
        sc.close();
    }
}
