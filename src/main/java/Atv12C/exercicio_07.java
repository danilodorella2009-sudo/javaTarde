package Atv12C;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite a quantidade de km");
        double x=sc.nextDouble();
        System.out.println("Digite a quantidade de consumo");
        double y= sc.nextDouble();
        double consumo= x/y;
        System.out.println("O consumo médio (km/l) " +consumo);
        sc.close();
    }
}
