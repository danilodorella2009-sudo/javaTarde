package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de defeitos no lote");
        int defeitos = sc.nextInt();
        String info = (defeitos > 5) ? "Lote reprovado" : "Lote aprovado";
        System.out.println("" + info);
        sc.close();
    }
}
