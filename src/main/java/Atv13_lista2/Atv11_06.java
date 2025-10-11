package Atv13_lista2;

import java.util.Scanner;

public class Atv11_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância do obstáculo em metros:");
        int distancia = sc.nextInt();

        if (distancia < 5) {
            System.out.println("Frear");
        } else if (distancia <= 15) {
            System.out.println("Reduzir velocidade");
        } else {
            System.out.println("Acelerar");
        }
        sc.close();
    }
}
