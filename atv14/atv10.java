package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        double x = sc.nextDouble();

        System.out.println(x%3==0 ? "O seu numero é divísivel por 3" : "O seu número nao é divisivel por 3");
        sc.close();


    }
}
