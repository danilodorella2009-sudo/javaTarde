package _01_estrututraSequencial;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite o Primeiro Numero:");
        int x = sc.nextInt();
        System.out.println();
        System.out.println("Digite o Segundo Numero;");
        int y = sc.nextInt();
        System.out.println();
        int soma = x + y;
        System.out.println("SOMA:" + soma);
        sc.close();


    }
}
