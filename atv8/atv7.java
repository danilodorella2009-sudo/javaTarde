package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de defeitos do lote");
        int defeitos = sc.nextInt();
        String info = (defeitos > 5) ? "Lote reprovado" : "lote aprovado";
        System.out.println("" + info);
        sc.close();
    }
}
