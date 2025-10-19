package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Célula CNC significa Controle Numérico Computadorizado.
        int peca, soma = 0, ciclos = 0;

        do {
            System.out.println("Informe a quantidade de peças produzidas: ");
            peca = sc.nextInt();
            soma += peca;
            ciclos++;
        } while (soma < 120);
        System.out.println("Ciclos: " + ciclos + " total: " + soma);
        sc.close();
    }
}
