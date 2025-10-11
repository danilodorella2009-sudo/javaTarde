package Atv13_lista2;

import java.util.Scanner;

public class Atv11_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça (1=Aprovado, 2=Reprovado, 3=Retrabalho, 4=Análise manual):");
        int codigo = sc.nextInt();

        if (codigo == 1) {
            System.out.println("Peça aprovada");
        } else if (codigo == 2) {
            System.out.println("Peça reprovada");
        } else if (codigo == 3) {
            System.out.println("Peça destinada ao retrabalho");
        } else if (codigo == 4) {
            System.out.println("Peça enviada para análise manual");
        } else {
            System.out.println("Código inválido");
        }
        sc.close();
    }
}
