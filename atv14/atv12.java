package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos voce tem");
        int idade = sc.nextInt();

        System.out.println(idade>=18 ? "Maior de idade" : "Menor de idade");
        sc.close();
    }
}
