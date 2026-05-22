package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv16 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numero = sc.nextInt();

        String resultado = (numero % 5 == 0) ? "Múltiplo de 5" : "Não é múltiplo de 5";
        System.out.println(resultado);
        sc.close();
    }
}
