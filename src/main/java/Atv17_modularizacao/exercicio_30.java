package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do Data Center (°C):");
        double temperatura = sc.nextDouble();
        String resultado = max(temperatura);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(double temperatura) {
        String acao;

        if (temperatura > 80) {
            acao = "Desligar servidores";
        } else if (temperatura >= 60) {
            acao = "Ativar resfriamento extra";
        } else {
            acao = "Temperatura normal";
        }
        return acao;
    }
}
