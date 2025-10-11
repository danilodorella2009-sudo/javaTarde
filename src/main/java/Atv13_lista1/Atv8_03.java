package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a porcentagem de energia do Robo");
        int robo = sc.nextInt();
        String info = (robo >= 50) ? "iniciando pintura" : "com energia insulficiente por favor recarregar";
        System.out.println("" + info);
        sc.close();

    }
}
