package atv20;

import java.util.Locale;
import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de temperatura que deseja saber");
        int n = sc.nextInt();
        double[] temperatura = new double[n];

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Digite a temperatura " + (i + 1) + ":");
            temperatura[i] = sc.nextInt();
            if (temperatura[i] >= 35) {
                System.out.println("Alerta ");
            } else {
                System.out.println("Temperatura normal ");
            }
        }
        sc.close();
    }
}
