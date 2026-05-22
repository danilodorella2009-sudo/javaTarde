package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos voce tem");
        int x = sc.nextInt();

        System.out.println(x>=16 ? "Voce pode votar" : "Voce nao pode votar");
        sc.close();
    }
}
