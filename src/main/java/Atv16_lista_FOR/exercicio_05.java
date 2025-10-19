package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite ENTER para começar o programa ");

        int soma = 0;
        for (int hora = 0; hora <= 24; hora++) {
            int energia = random.nextInt(60);
            soma += energia;
            System.out.println("Na hora: " + hora + " o consumo foi de: " + energia + " kWh");
            System.out.println("O consumo total foi de: " + soma);
            System.out.println("O consumo total de energia foi de: " + (soma / 24));
        }
        sc.close();
    }
}