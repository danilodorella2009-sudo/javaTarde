package Atv13_lista2;

import java.util.Scanner;

public class Atv11_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível do defeito na peça (alto, médio, baixo):");
        String nivel = sc.next();

        if (nivel.equalsIgnoreCase("alto")) {
            System.out.println("Defeito visível");
        } else if (nivel.equalsIgnoreCase("médio")) {
            System.out.println("Defeito microscópico");
        } else if (nivel.equalsIgnoreCase("baixo")) {
            System.out.println("Defeito ausente");
        } else {
            System.out.println("Nível inválido");
        }
        sc.close();
    }
}
