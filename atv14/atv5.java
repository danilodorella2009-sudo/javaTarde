package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int x = sc.nextInt();

        System.out.println(x%2==0 ? "O seu numero é par" : "O seu numero é impar");
        sc.close();
    }
}
