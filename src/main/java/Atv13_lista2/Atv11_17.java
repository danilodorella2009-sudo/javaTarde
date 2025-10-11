package Atv13_lista2;

import java.util.Scanner;

public class Atv11_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Robô A falhou? (true/false):");
        boolean roboA = sc.nextBoolean();

        System.out.println("Robô B falhou? (true/false):");
        boolean roboB = sc.nextBoolean();

        if (!roboA) {
            System.out.println("Robô A operando normalmente");
        } else if (!roboB) {
            System.out.println("Acionar Robô B");
        } else {
            System.out.println("Parar a linha de produção");
        }
        sc.close();
    }
}
