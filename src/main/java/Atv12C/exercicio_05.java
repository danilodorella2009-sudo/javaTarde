package Atv12C;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um lado do quadrado");
        double lado=sc.nextDouble();
        double area= lado*lado;
        double perimetro= lado*4;
        System.out.println("A area é:" +area);
        System.out.println("O perimetro é:" +perimetro);
        sc.close();

    }
}
