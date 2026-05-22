package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv14 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota");
        double nota = sc.nextDouble();

        System.out.println(nota >= 7 ? "Aprovado" : "Reprovado");
        sc.close();
    }
}
