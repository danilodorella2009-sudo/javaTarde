package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ddigite o indice de partículas: ");
        int particulas = sc.nextInt();

        if (particulas < 50) {
            System.out.println("Moderado");
        } else if (particulas <= 100) {
            System.out.println("Ruim");
        } else {
            System.out.println("Crítico");
        }
        sc.close();
    }
}
