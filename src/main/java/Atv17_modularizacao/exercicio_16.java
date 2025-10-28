package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nível do defeito na peça (alto, médio, baixo):");
        String nivel = sc.next();

        String resultado= max(nivel);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(String nivel) {
        String acao;
        if (nivel.equalsIgnoreCase("alto")) {
            acao = "Defeito visível";
        } else if (nivel.equalsIgnoreCase("médio")) {
            acao = "Defeito microscópico";
        } else if (nivel.equalsIgnoreCase("baixo")) {
            acao = "Defeito ausente";
        } else {
            acao = "Nível inválido";
        }
        return acao;
    }
}
