package atv12B;

import java.util.Scanner;

public class atv_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        double x = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        double y = sc.nextDouble();
        System.out.println("digite o terceiro numero");
        double z = sc.nextDouble();
        double cal = x + y + z / 3;
        System.out.println("A media é : " + cal);
        sc.close();
    }
}
