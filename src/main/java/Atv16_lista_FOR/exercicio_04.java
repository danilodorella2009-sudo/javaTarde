package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite ENTER para começar o programa ");
        int i, def;
        double soma, media;
        soma = 0;
        Random random = new Random();

        for (i = 0; i < 200; i++) {
            def = random.nextInt(5);
            soma += def;

            media = soma / 100;
            System.out.println("total defeituosas: " + soma);
            System.out.println("Porcentagem de peças defeituosas: " + media + "%");
        }
        sc.close();
    }
}
