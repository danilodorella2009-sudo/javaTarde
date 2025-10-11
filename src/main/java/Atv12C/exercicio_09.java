package Atv12C;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a bese maior");
        double x=sc.nextDouble();
        System.out.println("Digite a bese menor");
        double y= sc.nextDouble();
        System.out.println("Digite a altura");
        double z= sc.nextDouble();
        double area=((x + y) * z)/2;
        System.out.println("A area é:" +area);
        sc.close();

    }
}
