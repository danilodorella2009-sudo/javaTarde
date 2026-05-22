package _01_estrututraSequencial;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int soma = a * b - c * d;
        System.out.println("Diferencia é:" + soma);
        sc.close();


    }
}
