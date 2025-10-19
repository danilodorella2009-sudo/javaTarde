package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String codigo;
        int d01 = 0, d02 = 0, d03 = 0;

        System.out.println("Digite os códigos de defeito (D01, D02, D03) ou 'FIM' para encerrar:");
        label:
        do {
            codigo = sc.next().toUpperCase();
            switch (codigo) {
                case "FIM":
                    break label;
                case "D01":
                    d01++;
                    break;
                case "D02":
                    d02++;
                    break;
                case "D03":
                    d03++;
                    break;
                default:
                    System.out.println("Código inválido! Use D01, D02 ou D03.");
                    break;
            }
        } while (true);
        System.out.println("D01: " + d01 + " | D02: " + d02 + " | D03: " + d03);
        sc.close();
    }
}
