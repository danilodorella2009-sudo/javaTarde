package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ddigite o peso da carga: ");
        int carga = sc.nextInt();

        if (carga < 500) {
            System.out.println("Permitido");
        } else if (carga <= 1000) {
            System.out.println("Alerta");
        } else {
            System.out.println("Proibido");
        }
        sc.close();
    }
}
