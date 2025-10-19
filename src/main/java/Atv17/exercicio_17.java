package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double leitura;
        int consecutivasBaixas = 0, totalLeituras = 0;

        System.out.println("Digite os níveis RMS de vibração:");
        do {
            leitura = sc.nextDouble();
            totalLeituras++;
            if (leitura < 2.5) {
                consecutivasBaixas++;
            } else {
                consecutivasBaixas = 0;
            }
        } while (consecutivasBaixas < 3);
        System.out.println("Leituras totais: " + totalLeituras);
        sc.close();
    }
}
