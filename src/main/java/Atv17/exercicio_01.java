package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int temperatura;
        do {
            System.out.println("Digite a temperatura em °C: ");
            temperatura = sc.nextInt();
        } while (temperatura < 800 || temperatura > 1200);
        System.out.println("Temperatura válida: " + temperatura);
        sc.close();
    }
}
