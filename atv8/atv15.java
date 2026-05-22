package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a porcentagem de peças aprovadadas?");
        int pecas = sc.nextInt();
        String info = (pecas < 90) ? "qualidade abaixo do padrão" : "qualidade aceitavel";
        System.out.println("" + info);
        sc.close();
    }
}
