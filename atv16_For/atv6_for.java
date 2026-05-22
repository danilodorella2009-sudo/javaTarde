package atv16_For;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class atv6_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println(" Aperte a tecla ENTER para começar o programa");
        sc.nextLine();
        int calculo;
        double soma = 0, media;
        soma = 0;
        for (int i = 0; i < 50; i++) {
            calculo = rand.nextInt(30);
            soma += calculo;
            media = soma / 2;
            System.out.println("O consumo de material é: " + soma);
            System.out.println("Estoque medio é: " + media);
            sc.close();
        }
    }
}
