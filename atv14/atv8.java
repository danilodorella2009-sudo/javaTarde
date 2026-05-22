package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        String faixa = idade < 12 ? "Infantil" : (idade <= 18 ? "Juvenil" : "Adulto");

        System.out.println("" + faixa);
        sc.close();
    }
}
