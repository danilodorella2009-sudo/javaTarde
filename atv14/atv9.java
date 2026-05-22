package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x > y ? "É maior" : (x < y ? "É maior" : "numeros iguais"));
        sc.close();
    }
}
