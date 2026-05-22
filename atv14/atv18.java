package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv18 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int x = sc.nextInt();

        System.out.println("Digite o segundo numero");
        int y = sc.nextInt();
        String resultado = (x == y) ? "Numeros iguais" : (x > y) ? x + " é maior" : y + " é maior";

        System.out.println(resultado);
        sc.close();
    }
}
