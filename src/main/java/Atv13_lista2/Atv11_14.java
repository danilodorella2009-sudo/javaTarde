package Atv13_lista2;

import java.util.Scanner;

public class Atv11_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de itens detectados na esteira:");
        int itens = sc.nextInt();

        if (itens < 10) {
            System.out.println("Velocidade lenta");
        } else if (itens <= 30) {
            System.out.println("Velocidade média");
        } else {
            System.out.println("Velocidade rápida");
        }
        sc.close();
    }
}
