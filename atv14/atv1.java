package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos vc tem");
        int x = sc.nextInt();

        System.out.println(x>=18 ? "Maior de idade" : "Menor de idade");
        sc.close();
    }
}
