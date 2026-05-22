package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos produtos vcs produziram");
        int produto = sc.nextInt();
        String info = (produto >= 100) ? "Meta atingida" : "Produçao abaixo da meta";
        System.out.println("" + info);
        sc.close();
    }
}
