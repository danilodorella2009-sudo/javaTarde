package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv29 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o percentual de defeitos: ");
        int inspecao = sc.nextInt();

        if (inspecao > 20) {
            System.out.println("Reprovar");
        } else if (inspecao >= 10) {
            System.out.println("Retrabalho");
        } else {
            System.out.println("Aprovar");
        }
        sc.close();
    }
}
