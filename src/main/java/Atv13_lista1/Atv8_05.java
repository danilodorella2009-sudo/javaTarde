package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual e a sua velocidade?");
        int velocidade = sc.nextInt();
        String info = (velocidade > 120) ? "Reduzir a velocidade imediatamente" : "Velocidade dentro do limite";
        System.out.println("" + info);
        sc.close();

    }
}
