package atv12B;

import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a area do circulo");
        double raio = sc.nextDouble();
        double area = 3.14 * raio * raio;
        System.out.println("O resultado é:" + area);
        sc.close();

    }
}
