package atv12C;

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o lado do quadrado");
        double x = sc.nextDouble();
        double area = x * x;
        double per = x * 4;
        System.out.println("A area do quadrado é: " + area);
        System.out.println();
        System.out.println("O perimetro do quadrado é:" + per);
        sc.close();
    }
}
