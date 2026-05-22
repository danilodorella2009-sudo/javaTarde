package atv12B;

import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua base:");
        double base = sc.nextDouble();
        System.out.println("Digite a altura:");
        double altura = sc.nextDouble();
        double cal = (base * altura) / 2;
        System.out.println("o valor da sua area é:" + cal);
        sc.close();
    }
}
