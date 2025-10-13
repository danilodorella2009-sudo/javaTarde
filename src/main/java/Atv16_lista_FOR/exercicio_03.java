package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        Random gerador = new Random();

        int DIAS = 30;
        double soma = 0;

        System.out.println(" Análise de Produção - 30 dias");

        for (int dia = 1; dia <= DIAS; dia++) {
            int producao = 400 + gerador.nextInt(201);
            soma += producao;

            System.out.println("Dia " + dia + ": produção = " + producao + " unidades");
        }

        double media = soma / DIAS;

        System.out.println("Media diaria do mês: " + soma + " unidades");
        System.out.printf("Média diária: %.2f unidades%n", media);
    }
}
