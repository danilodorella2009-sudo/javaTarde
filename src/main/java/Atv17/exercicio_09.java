package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean resultado;
        int tentativas = 0;

        do {
            System.out.println("A peça passou no teste? (true/false): ");
            resultado = sc.nextBoolean();
            tentativas++;
        } while (!resultado);
        System.out.println("Tentativas " + tentativas);
        sc.close();
    }
}
