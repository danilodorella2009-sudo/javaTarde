package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso do pacote em kg:");
        double peso = sc.nextDouble();
    }

    public static String max(double peso) {
        String acao;
        if (peso < 10) {
            acao = "Pacote leve";
        } else if (peso <= 30) {
            acao = "Pacote médio";
        } else if (peso <= 60) {
            acao = "Pacote pesado";
        } else {
            acao = "Pacote muito pesado";
        }
        return acao;

    }
}
