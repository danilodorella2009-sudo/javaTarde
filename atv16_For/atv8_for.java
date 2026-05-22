package atv16_For;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class atv8_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Aperte a tecla ENTER para começar o programa");
        sc.nextLine();

        int soma = 0;
        int ano = 365 * 24;
        for (int dia = 1; dia <= 365; dia++) {
            int i = rand.nextInt(ano);
            System.out.println("Dia: " + dia + "com" + i + "horas de operação");
            soma += i;
            int total = soma * ano;
            System.out.println("O total de horas de operaçao foi de: " + total);
            sc.close();

        }
    }
}
