package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de itens detectados na esteira:");
        int itens = sc.nextInt();

        String resultado=max(itens);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int itens) {
        String acao;
        if (itens < 10) {
            acao = "Velocidade lenta";
        } else if (itens <= 30) {
            acao = "Velocidade média";
        } else {
            acao = "Velocidade rápida";
        }
        return acao;
    }
}
