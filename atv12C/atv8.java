package atv12C;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double x = sc.nextDouble();
        double cal = x /3;
        System.out.println("O valor das parcelas são:  " + cal + " por mês");
        sc.close();
    }
}
