package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int x = sc.nextInt();

        System.out.println(x<0 ? "Negativo" : (x==0 ? "Zero": "Positivo"));
        sc.close();
    }
}
