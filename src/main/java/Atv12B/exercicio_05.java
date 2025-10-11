package Atv12B;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario");
        double x= sc.nextDouble();
        double cal= (x*10)/100;
        double soma= x+cal;
        System.out.println("O valor com o aumento é:" +soma);
        sc.close();
    }
}
