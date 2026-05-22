package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o indice de defeito do lote");
        int defeito = sc.nextInt();
        if (defeito > 10) {
            System.out.println("acionar alerta " + defeito + "%");
        } else if (defeito <= 10) {
            System.out.println("lote aprovado " + defeito + "%");
        } else {
            System.out.println("");
        }
        sc.close();
    }
}
