package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a porcentagem de peças aprovadas?");
        int porce = sc.nextInt();
        String info = (porce < 90) ? "Qualidade abaixo do padrão" : "Qualidade aceitavel";
        System.out.println("" + info);
        sc.close();
    }
}
