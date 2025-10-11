package Atv13_lista2;

import java.util.Scanner;

public class Atv11_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do Data Center (°C):");
        double temperatura = sc.nextDouble();

        if (temperatura > 80) {
            System.out.println("Desligar servidores");
        } else if (temperatura >= 60) {
            System.out.println("Ativar resfriamento extra");
        } else {
            System.out.println("Temperatura normal");
        }
        sc.close();
    }
}
