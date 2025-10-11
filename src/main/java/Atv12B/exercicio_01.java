package Atv12B;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int x= sc.nextInt();
        System.out.println();
        System.out.println("Digite o segundo numero");
        int y= sc.nextInt();
        System.out.println();
        double soma= x+y;
        System.out.println("SOMA:" +soma);
        sc.close();
    }
}
