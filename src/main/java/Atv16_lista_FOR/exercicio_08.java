package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Controle de manutenção preventiva");
        int soma = 0;
        int ano = 365 * 24;
        for (int dia = 1; dia <= 365; dia++) {
            int i = random.nextInt();
            System.out.println("Dia: " + dia + " com " + i + " horas de operação");
            soma += i;
        }
        int total = soma * ano;
        System.out.println("O total de horas de operação: " + total);
        sc.close();
    }
}
