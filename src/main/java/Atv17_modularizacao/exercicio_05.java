package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas de uso da máquina:");
        int horas = sc.nextInt();

        String resultado=max(horas);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int horas) {
        String acao;

        if (horas < 500) {
            acao = "Urgência baixa";
        } else if (horas <= 1000) {
            acao = "Urgência média";
        } else {
            acao = "Urgência alta";
        }
        return acao;
    }
}
