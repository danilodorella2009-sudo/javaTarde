package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C: ");
        double temperatura = sc.nextDouble();
        System.out.println("Digite a vibração: ");
        double vibracao = sc.nextDouble();
        String resultado = max(temperatura, vibracao);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(double temperatura, double vibracao) {
        String acao;
        if (temperatura > 90 || vibracao > 80) {
            acao = ("ALERTA! Máquina em EMERGÊNCIA. Desligar imediatamente.");
        } else {
            acao = ("Máquina operando normalmente.");
        }
        return acao;
    }
}
