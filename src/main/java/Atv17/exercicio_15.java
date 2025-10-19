package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor;

        do {
            System.out.print("Informe o valor medido (mA): ");
            valor = sc.nextDouble();
            if (valor < 4.0 || valor > 20.0) {
                System.out.println("Valor fora da faixa aceitável (4.0 a 20.0 mA). Tente novamente.");
            }
        } while (valor < 4.0 || valor > 20.0);
        System.out.println("Calibração OK: " + valor + " mA");
        sc.close();
    }
}
