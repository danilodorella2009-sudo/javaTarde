package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura da máquina (°C):");
        double temperatura = sc.nextDouble();
        System.out.println("Digite o nível de vibração da máquina (%):");
        double vibracao = sc.nextDouble();

        String resultado = max(temperatura, vibracao);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(double temperatura, double vibracao) {
        String acao;
        if (temperatura > 90 || vibracao > 80) {
            acao = "Desligar máquina em emergência";
        } else {
            acao = "Máquina funcionando normalmente";
        }
        return acao;
    }
}
