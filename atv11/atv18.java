package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de energia solar: ");
        int solar = sc.nextInt();

        if (solar > 70) {
            System.out.println("Usar energia solar");
        } else if (solar <= 70) {
            System.out.println("Híbrido");
        } else if (solar <= 30) {
            System.out.println("Usar rede elétrica");
        }
        sc.close();
    }
}
