package Atv12C;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double x= sc.nextDouble();
        double parcela= x/3;
        System.out.println("O valor a da percela por mês é:" +parcela);
        sc.close();
    }
}
