package atv12C;

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidade de km");
        double x = sc.nextDouble();
        System.out.println("Digite a quantidade de litros de combustiveis comsumidos");
        double y = sc.nextDouble();
        double cal = x / y;
        System.out.println("o consumo medio (km/l)" + cal);
        sc.close();
    }
}
