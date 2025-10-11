package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int x= sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int t= sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int y= sc.nextInt();
        System.out.println("Digite o querto valor:");
        int r= sc.nextInt();
        int soma= (x*t-y*r);
        System.out.println("A diferença é:" +soma);
        sc.close();
    }
}
