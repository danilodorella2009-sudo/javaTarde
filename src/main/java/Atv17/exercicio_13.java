package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int minutos = 0;

        char encerrar;
        do {
            minutos++;
            System.out.println("Misturando... " + minutos + " minuto(s)");
            if (minutos >= 10) {
                System.out.print("Deseja encerrar a mistura? (S/N): ");
                encerrar = sc.next().toUpperCase().charAt(0);

                if (encerrar == 'S') {
                    System.out.println("Mistura encerrada aos " + minutos + " minutos.");
                    break;
                }
            }
        } while (true);
        sc.close();
    }
}
