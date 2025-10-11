package Atv13_lista2;

import java.util.Scanner;

public class Atv11_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o nível de bateria do drone (%):");
        int bateria = sc.nextInt();

        if (bateria < 20) {
            System.out.println("Retorno imediato");
        } else if (bateria <= 60) {
            System.out.println("Rota curta");
        } else {
            System.out.println("Rota longa");
        }
        sc.close();
    }
}
