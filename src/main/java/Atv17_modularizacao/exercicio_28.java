package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Estrada bloqueada? (true/false):");
        boolean bloqueada = sc.nextBoolean();

        System.out.println("Trânsito alto? (true/false):");
        boolean transitoAlto = sc.nextBoolean();
        String resultado = max(bloqueada,transitoAlto);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(boolean bloqueada, boolean transitoAlto) {
        String acao;

        if (bloqueada) {
            acao = "Recalcular rota";
        } else if (transitoAlto) {
            acao = "Rota alternativa";
        } else {
            acao = "Seguir normal";
        }
        return acao;
    }
}
