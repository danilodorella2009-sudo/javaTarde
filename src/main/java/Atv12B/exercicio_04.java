package Atv12B;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura");
        double altura = sc.nextDouble();
        double cal = (base * altura) / 2;
        System.out.println("O valor da sua area é:" + cal);
        sc.close();
    }
}
