package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        double soma = 0;
        for (int hora = 0; hora <= 12; hora++) {
            System.out.println("A hora atual é: " + hora);
            System.out.println("A média da temperatura é: " + soma / 60);
            for (int i = 0; i <= 60; i++) {
                int temperatura = gerador.nextInt(201);
                System.out.println("No minuto " + i + "A Temperatura foi:" + temperatura);
                soma += temperatura;
            }
        }
    }
}