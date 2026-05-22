package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de produtos no estoque: ");
        int produto = sc.nextInt();

        if (produto < 10) {
            System.out.println("Reabastecer urgente");
        } else if (produto <= 30) {
            System.out.println("Alerta");
        } else {
            System.out.println("Normal");
        }
        sc.close();
    }
}
