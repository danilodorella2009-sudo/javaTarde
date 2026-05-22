package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a temperatura");
        int tem = sc.nextInt();
        if (tem < 0) {
            System.out.println("alerta congelamento");
        } else if (tem <= 40) {
            System.out.println("temperatura normal");
        } else {
            System.out.println("alerta superaquecimento");
        }
        sc.close();
    }
}
