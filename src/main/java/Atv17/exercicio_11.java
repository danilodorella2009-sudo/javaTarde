package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int umidade;

        do {
            System.out.print("Informe a umidade (%): ");
            umidade = sc.nextInt();
            if (umidade < 30 || umidade > 55) {
                System.out.println("Valor fora do intervalo [30, 55]. Tente novamente.");
            }
        } while (umidade < 30 || umidade > 55);
        System.out.println("Umidade aceita: " + umidade + "%");
        sc.close();
    }
}
