package Atv12B;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double x= sc.nextDouble();
        System.out.println("Digite o segundo numero");
        double y= sc.nextDouble();
        System.out.println("Digite o terceiro numero");
        double z= sc.nextDouble();
        double cal= x+y+z/ 3;
        System.out.println("A média é:" +cal);
        sc.close();
        }
    }

