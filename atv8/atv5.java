package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a velocidade");
        int velocidade = sc.nextInt();
        String info = (velocidade > 120) ? "Reduzir velocidade imediatamente" : "velocidade dentro do limite";
        System.out.println("" + info);
        sc.close();

    }
}
