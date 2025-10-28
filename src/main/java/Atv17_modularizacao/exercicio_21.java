package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso da carga do veículo (kg):");
        double carga = sc.nextDouble();
        String resultado = max(carga);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(double carga) {
        String acao;

        if (carga < 500) {
            acao = "Carga permitida";
        } else if (carga <= 1000) {
            acao = "Alerta: carga alta";
        } else {
            acao = "Carga proibida";
        }
        return acao;
    }
}
