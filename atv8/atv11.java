package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Tem operador disponivel? (sim/nao)");
        String presenca = sc.next();

        String info = (presenca.equalsIgnoreCase("sim")) ? "Linha operando normalmente." : "PAusar linha de produção.";
        System.out.println("" + info);
        sc.close();

    }
}
