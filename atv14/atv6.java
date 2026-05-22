package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua nota?");
        double nota = sc.nextDouble();

        System.out.println(nota>=7 ? "Aprovado" : "Reprovado");
        sc.close();
    }
}
