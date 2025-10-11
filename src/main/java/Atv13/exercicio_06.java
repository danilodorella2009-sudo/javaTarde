package Atv13;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos ja produziram");
        int produziram = sc.nextInt();
        String info = (produziram >= 1000) ? "Meta atingida" : "Produção abaixo da meta";
        System.out.println("" + info);
        sc.close();
    }
}
