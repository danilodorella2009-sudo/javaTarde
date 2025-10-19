package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite ENTRE para começar o programa");

        int cal;
        double soma, media;
        soma = 0;
        for (int m = 0; m <= 50; m++) {
            cal = random.nextInt(30);
            soma += cal;

            media = soma / 2;
            System.out.println("Consumo de materiais: " + soma);
            System.out.println("Estoque medio: " + media);
        }
        sc.close();
    }

}

