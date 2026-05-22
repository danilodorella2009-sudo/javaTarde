package atv15;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas = 0;
        int producaoTotal = 0;

        System.out.println("Digite a produção por hora");
        int producaoPorHora = sc.nextInt();

        System.out.println("Digite quantas horas a maquina vai trabalhar: ");
        int totalHoras = sc.nextInt();

        while (horas < totalHoras) {
            producaoTotal +=
                    producaoPorHora;
            horas++;
            System.out.println("Hora " + horas + ": produçao total = " + producaoTotal + " unidades");
        }
        sc.close();
    }
}
