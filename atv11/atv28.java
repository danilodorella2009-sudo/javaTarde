package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ddigite a conddição da estrada (bloqueada, transito, normal): ");
        String transporte = sc.nextLine();

        if (transporte.equalsIgnoreCase("bloqueada")) {
            System.out.println("Recalcular rota");
        } else if (transporte.equalsIgnoreCase("transito")) {
            System.out.println("Rota alternativa");
        } else {
            System.out.println("Seguir normal");
        }
        sc.close();
    }
}
