package Atv13_lista2;

import java.util.Scanner;

public class Atv11_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o índice de partículas no ar:");
        int indice = sc.nextInt();

        if (indice < 50) {
            System.out.println("Qualidade do ar: bom");
        } else if (indice <= 100) {
            System.out.println("Qualidade do ar: moderado");
        } else if (indice <= 200) {
            System.out.println("Qualidade do ar: ruim");
        } else {
            System.out.println("Qualidade do ar: crítico");
        }
        sc.close();
    }
}
