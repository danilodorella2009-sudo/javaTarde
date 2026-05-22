package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv20 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = sc.nextInt();
        String resultado = (numero % 2 == 0) ? " Par" : " Ìmpar";

        System.out.println("O seun= numero é:" + resultado);
        sc.close();
    }
}
