package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_29 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o percentual de defeitos (%):");
        double defeitos = sc.nextDouble();
        String resultado = max(defeitos);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(double defeitos) {
        String acao;

        if (defeitos > 20) {
            acao = "Reprovar lote";
        } else if (defeitos >= 10) {
            acao = "Enviar para retrabalho";
        } else {
            acao = "Aprovar lote";
        }
        return acao;
    }
}
