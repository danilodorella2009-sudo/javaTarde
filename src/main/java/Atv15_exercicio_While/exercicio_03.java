package Atv15_exercicio_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horas = 0;
        int producaoTotal = 0;

        System.out.println("Digite a produção");
        int producaoPorHora = sc.nextInt();

        System.out.println("Digite quantas horas a maquina vai trablhar: ");
        int totalDeHoras = sc.nextInt();

        while (horas < totalDeHoras) {
            producaoTotal +=
                    producaoPorHora;
            horas++;
            System.out.println("hora" + horas + ": produção total = " + producaoTotal + "unidades");
        }
        sc.close();
    }
}
