package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nivel de energia(0 a 100)");
        int energia = sc.nextInt();

        if (energia < 30) {
            System.out.println("modo econômico");
        } else if (energia <= 70) {
            System.out.println("modo normal");
        } else {
            System.out.println("modo turbo");
        }
        sc.close();
    }
}
