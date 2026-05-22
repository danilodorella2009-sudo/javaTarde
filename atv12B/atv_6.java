package atv12B;

import java.util.Scanner;

public class atv_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Celsius:");
        double x = sc.nextDouble();
        double f = (x * 9 / 5) + 32;
        System.out.println(" O valor da temperatura em Fahrenheit é: " + f);
        sc.close();


    }
}
