package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Robô A falhou? (true/false):");
        boolean roboA = sc.nextBoolean();

        System.out.println("Robô B falhou? (true/false):");
        boolean roboB = sc.nextBoolean();
        String resultado = max(roboA, roboB);
        System.out.println(resultado);
        sc.close();
    }

    public static String max( boolean roboA, Boolean roboB) {
        String acao;

        if (!roboA) {
            acao = "Robô A operando normalmente";
        } else if (!roboB) {
            acao = "Acionar Robô B";
        } else {
            acao = "Parar a linha de produção";
        }
        return acao;
    }
}
