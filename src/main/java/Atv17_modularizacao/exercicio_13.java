package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de peças produzidas por hora:");
        int producao = sc.nextInt();

        String resultado= max(producao);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int producao) {
        String acao;

        if (producao < 50) {
            acao = "Desempenho baixo";
        } else if (producao <= 100) {
            acao = "Desempenho regular";
        } else {
            acao = "Desempenho ótimo";
        }
        return acao;
    }
}
