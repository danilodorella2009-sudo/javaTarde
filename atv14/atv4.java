package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celsius");
        double x = sc.nextDouble();

        System.out.println(x<18 ? "Frio" : "Quente");
        sc.close();
    }
}
