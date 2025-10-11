package Atv13_lista2;

import java.util.Scanner;

public class Atv11_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso da carga do veículo (kg):");
        double carga = sc.nextDouble();

        if (carga < 500) {
            System.out.println("Carga permitida");
        } else if (carga <= 1000) {
            System.out.println("Alerta: carga alta");
        } else {
            System.out.println("Carga proibida");
        }
        sc.close();
    }
}
