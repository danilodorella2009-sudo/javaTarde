package Atv13_lista2;

import java.util.Scanner;

public class Atv11_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a quantidade de material restante (%):");
        int material = sc.nextInt();

        if (material < 20) {
            System.out.println("Trocar material");
        } else {
            System.out.println("Continuar impressão");
        }
        sc.close();
    }
}
