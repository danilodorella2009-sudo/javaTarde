package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o peso da carga: ");
        int suspe = sc.nextInt();
        String resultado = max(suspe);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int suspe) {
        String acao;
        if (suspe > 70) {
            acao = ("Suspeito");
        } else {
            if (suspe < 30) {
                acao = ("normal");
            } else {
                acao = ("Bloquear acesso");
            }
        }
        return acao;
    }
}
