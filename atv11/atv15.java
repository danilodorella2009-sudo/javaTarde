package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int temperatura, vibracao;

        System.out.println("Digite a temperatura em °C: ");
        temperatura = sc.nextInt();

        System.out.println("Digite a vibração: ");
        vibracao = sc.nextInt();

        if (temperatura > 90 || vibracao > 80) {
            System.out.println("ALERTA! Máquina em EMERGÊNCIA. Desligar imediatamente.");
        } else {
            System.out.println("Máquina operando normalmente.");
        }
        sc.close();
    }
}
