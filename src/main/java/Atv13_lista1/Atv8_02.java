package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de unidades no estoque");
        int estoque = sc.nextInt();
        String info = (estoque < 20) ? "Reabastecer imediatamente" : "Estoque insuficiente";
        System.out.println("quantidade no estoque" + info);
        sc.close();
    }
}
