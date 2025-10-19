package Desafios_de_programação_logica;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que deseja sacar: ");
        int valor = sc.nextInt();
        int notas50 = 0, notas10 = 0, notas2 = 0;
        if (valor < 2) {
            System.out.println("Valor inválido! O saque mínimo é de R$2.");
        } else {
            while (valor >= 50) {
                valor -= 50;
                notas50++;
            }
            while (valor >= 10) {
                valor -= 10;
                notas10++;
            }
            while (valor >= 2) {
                valor -= 2;
                notas2++;
            }
            System.out.println("Distribuição de cédulas:");
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 2 : " + notas2);
            if (valor != 0) {
                System.out.println("Valor restante (" + valor + " real) não pode ser sacado com as cédulas disponíveis.");
            }
        }

        sc.close();
    }
}
