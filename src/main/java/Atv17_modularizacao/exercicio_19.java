package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do pH:");
        double ph = sc.nextDouble();
        String resultado = max(ph);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(double ph) {
        String acao;

        if (ph < 7) {
            acao = "Ácido";
        } else if (ph == 7) {
            acao = "Neutro";
        } else {
            acao = "Básico";
        }
        return acao;

    }
}
