package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nivel de eficiência");
        int eficiência = sc.nextInt();
        String info = (eficiência > 85) ? "Eficiência aceitavel" : "Manutenção recomendade";
        System.out.println("" + info);
        sc.close();

    }
}
