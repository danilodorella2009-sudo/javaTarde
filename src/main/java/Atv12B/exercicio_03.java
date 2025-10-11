package Atv12B;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite a area do circulo");
        double raio= sc.nextDouble();
        double area= 3.14 *raio * raio;
        System.out.println("A area do circulo:" + area);
        sc.close();
    }
}
