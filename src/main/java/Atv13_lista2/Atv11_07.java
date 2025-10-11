package Atv13_lista2;

import java.util.Scanner;

public class Atv11_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso do pacote em kg:");
        double peso = sc.nextDouble();

        if (peso < 10) {
            System.out.println("Pacote leve");
        } else if (peso <= 30) {
            System.out.println("Pacote médio");
        } else if (peso <= 60) {
            System.out.println("Pacote pesado");
        } else {
            System.out.println("Pacote muito pesado");
        }
        sc.close();
    }
}
