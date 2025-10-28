package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        int temperatura = sc.nextInt();
        String resultado = max(temperatura);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int temperatura) {
        String acao;

        if (temperatura < 0) {
            acao = "Alerta de congelamento ";
        } else if (temperatura <= 40) {
            acao = "Temperatura normal";
        } else {
            acao = "Alerta de superaquecimento ";
        }
        return acao;
    }
}
