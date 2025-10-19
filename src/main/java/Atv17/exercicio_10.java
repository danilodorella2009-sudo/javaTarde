package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* A sigla OEE significa Overall Equipment Effectiveness, que se traduz
        para Eficiência Global do Equipamento em português. Trata-se de um indicador de desempenho
        industrial que mede o quão eficientemente uma máquina ou equipamento está sendo utilizado */
        String continuar;
        int ciclos, paradas;
        double disponibilidade;

        do {
            System.out.println("Informe os ciclos de produção (>0): ");
            ciclos = sc.nextInt();
            while (ciclos <= 0) {
                System.out.println("Valor inválido informe os cilcos (>0): ");
                ciclos = sc.nextInt();
            }
            System.out.println("Informe as paradas (>=0): ");
            paradas = sc.nextInt();
            while (paradas < 0) {
                System.out.println("Valor inválido! Informe as paradas (>=0): ");
                paradas = sc.nextInt();
            }
            disponibilidade = (double) ciclos / (ciclos + paradas);
            System.out.println("Disponibilidade: " + disponibilidade);
            System.out.println("Deseja calcular novamente ? (s/n): ");
            continuar = sc.next();
        }while (continuar.equalsIgnoreCase("s"));
        System.out.println("Programa encerrado. ");
        sc.close();
    }
}
