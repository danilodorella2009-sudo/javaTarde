package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o índice de partículas no ar:");
        int indice = sc.nextInt();
        String resultado = max(indice);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int indice) {
        String acao;

        if (indice < 50) {
            acao = "Qualidade do ar: bom";
        } else if (indice <= 100) {
            acao = "Qualidade do ar: moderado";
        } else if (indice <= 200) {
            acao = "Qualidade do ar: ruim";
        } else {
            acao = "Qualidade do ar: crítico";
        }
        return acao;
    }
}
