package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o primeiro Numero:");
        int x= sc.nextInt();
        System.out.println();
        System.out.println("Digite o segundo numero:");
        int y= sc.nextInt();
        System.out.println();
        double soma= x + y;
        System.out.println("SOMA:" + soma);
        sc.close();
    }
}
