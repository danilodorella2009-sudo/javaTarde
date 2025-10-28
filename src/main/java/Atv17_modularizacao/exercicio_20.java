package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora atual (0–23):");
        int hora = sc.nextInt();
        String resultado = max(hora);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int hora) {
        String acao;


        if (hora < 12) {
            acao = "Turno da manhã";
        } else if (hora <= 18) {
            acao = "Turno da tarde";
        } else {
            acao = "Turno da noite";
        }
        return acao;
    }
}
