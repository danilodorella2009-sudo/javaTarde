package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o indice de defeito do lote");
        int defeito = sc.nextInt();
        String resultado = max(defeito);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int defeito) {
        String acao = "";
        if (defeito > 10) {
            acao = "acionar alerta" + defeito + "%";
        } else if (defeito <= 10) {
            acao = "lote aprovado" + defeito + "%";
        }
        return acao;
    }
}
