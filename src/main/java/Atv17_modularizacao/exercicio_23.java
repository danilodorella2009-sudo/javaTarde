package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o percentual de tráfego suspeito (%):");
        int trafego = sc.nextInt();
        String resultado = max(trafego);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int trafego) {
        String acao;

        if (trafego > 70) {
            acao = "Bloquear acesso";
        } else if (trafego >= 30) {
            acao = "Alerta";
        } else {
            acao = "Tráfego normal";
        }
        return acao;
    }
}
