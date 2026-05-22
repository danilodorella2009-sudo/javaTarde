package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("O crachá é válido ? (sim/nao): ");
        String cracha = sc.nextLine();

        System.out.println("O capacete está sendo usado ? (sim/nao): ");
        String capacete = sc.nextLine();

        System.out.println("O funcionário está no horário do turno ? (sim/nao): ");
        String horario = sc.nextLine();

        if (cracha.equalsIgnoreCase("sim")) {
            if (capacete.equalsIgnoreCase("sim")) {
                if (horario.equalsIgnoreCase("sim")) {
                    System.out.println("Acesso permitido");
                } else {
                    System.out.println("Acesso negado");
                }
            } else {
                System.out.println("Acesso negado");
            }
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
