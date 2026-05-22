package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso da carga: ");
        int suspe = sc.nextInt();

        if (suspe > 70) {
            System.out.println("Suspeito");
        } else {
            if (suspe < 30) {
                System.out.println("normal");
            } else {
                System.out.println("Bloquear acesso");
            }
        }

        sc.close();
    }
}
