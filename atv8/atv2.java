package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de unidades no estoque");
        int estoque = sc.nextInt();
        if (estoque < 20) {

            System.out.println("Reabastecer imediatamente");
        } else {
            System.out.println("Estoque suficiente");
            sc.close();
        }
    }
}

