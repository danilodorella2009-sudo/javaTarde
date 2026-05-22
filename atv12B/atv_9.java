package atv12B;

import java.util.Scanner;

public class atv_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos voce tem");
        double x = sc.nextDouble();
        double cal = x * 12;
        System.out.println("a sua idade em meses é:" + cal);
        sc.close();
    }
}
