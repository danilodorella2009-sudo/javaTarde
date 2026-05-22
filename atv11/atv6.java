package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distancia detectada pelo sensor");
        int sensor = sc.nextInt();

        if (sensor < 5) {
            System.out.println("Precisa frear");
        } else if (sensor <= 15) {
            System.out.println("Precisa reduzir a velocidade");
        } else {
            System.out.println("Precisa acelerar");
        }
        sc.close();
    }
}
