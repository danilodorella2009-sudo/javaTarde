package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a intensidade elétrica: ");
        int verificacao = sc.nextInt();

        if (verificacao < 100) {
            System.out.println("Fraca");
        } else if (verificacao <= 200) {
            System.out.println("Média");
        } else {
            System.out.println("Forte");
        }
        sc.close();
    }
}
