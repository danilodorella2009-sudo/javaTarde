package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("O crachá é válido ? (sim/nao): ");
        String cracha = sc.nextLine();

        System.out.println("O capacete está sendo usado ? (sim/nao): ");
        String capacete = sc.nextLine();

        System.out.println("O funcionário está no horário do turno ? (sim/nao): ");
        String horario = sc.nextLine();

        String resultado = max(cracha, capacete, horario);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(String cracha, String capacete, String horario) {
        String acao = "";

        if (cracha.equalsIgnoreCase("sim")) {
            if (capacete.equalsIgnoreCase("sim")) {
                if (horario.equalsIgnoreCase("sim")) {
                    acao = "Acesso permitido";
                } else {
                    acao = "Acesso negado";
                }
            } else {
                acao = "Acesso negado";
            }
        } else {
            acao = "Acesso negado";
        }
        return acao;
    }
}
