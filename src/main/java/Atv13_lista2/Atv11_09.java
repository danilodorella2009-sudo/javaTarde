package Atv13_lista2;

import java.util.Scanner;

public class Atv11_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o índice de defeito do lote (%):");
        double indice = sc.nextDouble();

        if (indice > 10) {
            System.out.println("Acionar alerta");
        } else {
            System.out.println("Lote aprovado");
        }
        sc.close();
    }
}
