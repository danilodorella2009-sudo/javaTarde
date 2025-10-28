package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o índice de defeito do lote: ");
        int defeito = sc.nextInt();
        String resultado = max(defeito);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int defeito) {
        String acao = "";

        if (defeito > 10) {
            acao = "Acionar alerta " + defeito + "%";
        } else if (defeito <= 10) {
            acao = "Lote aprovado " + defeito + " %";
        }
        return acao;
    }
}
