package Atv13_lista2;

import java.util.Scanner;

public class Atv11_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de tinta restante (%):");
        int tinta = sc.nextInt();

        if (tinta < 15) {
            System.out.println("Parar");
        } else if (tinta <= 50) {
            System.out.println("Alerta: pouca tinta");
        } else {
            System.out.println("Continuar pintura");
        }
        sc.close();
    }
    }

