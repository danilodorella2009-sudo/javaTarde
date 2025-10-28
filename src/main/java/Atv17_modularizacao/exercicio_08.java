package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de material restante (%):");
        int material = sc.nextInt();

        String resultado= max(material);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(double peso) {
        String acao;
        if (peso < 20) {
            acao = "Trocar material";
        } else {
            acao = "Continuar impressão";
        }
        return acao;
    }
}
