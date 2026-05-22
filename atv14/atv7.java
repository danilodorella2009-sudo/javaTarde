package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salario");
        double salario = sc.nextDouble();
        double imposto = salario > 5.000 ? salario * 0.2 : salario * 0.1;

        System.out.println("Imposto" + imposto);
        sc.close();
    }
}
