package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv17 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura");
        double temperatura = sc.nextDouble();

        System.out.println(temperatura > 30 ? "Quente" : "Frio");
        sc.close();
    }
}
