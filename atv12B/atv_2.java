package atv12B;

import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double x = sc.nextDouble();
        double cal = x * 2;
        System.out.println("o dobro do seu numero é: " + cal);
        sc.close();


    }
}
