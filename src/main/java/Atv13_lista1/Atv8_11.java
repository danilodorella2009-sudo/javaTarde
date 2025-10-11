package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Tem operador disponível? (sim/nao)");
        String presenca = sc.next();

        String info = (presenca.equalsIgnoreCase("sim")) ? "Linha operando normalmente." : "Pausar linha de produção.";
        System.out.println("" + info);
        sc.close();




    }
}
