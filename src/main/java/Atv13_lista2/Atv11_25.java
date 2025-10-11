package Atv13_lista2;

import java.util.Scanner;

public class Atv11_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a intensidade elétrica (A):");
        int intensidade = sc.nextInt();

        if (intensidade < 100) {
            System.out.println("Intensidade fraca");
        } else if (intensidade <= 200) {
            System.out.println("Intensidade média");
        } else {
            System.out.println("Intensidade forte");
        }
        sc.close();
    }
}
