package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas de uso da máquina:");
        int horas = sc.nextInt();

        System.out.println(max(horas));
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
