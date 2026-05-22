package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero entre 1 e 399: ");
        int numero = sc.nextInt();
        if (numero < 1 || numero > 399) {
            System.out.print("Numero fora do limite permitido (1 a 399).");
        } else {
            System.out.print("Numero romano: ");
            while (numero >= 100) {
                System.out.print("C");
                numero -= 100;
            }
            if (numero >= 90) {
                System.out.print("XC");
                numero -= 90;
            } else if (numero >= 50) {
                System.out.print("L");
                numero -= 50;
                while (numero >= 10) {
                    System.out.print("X");
                    numero -= 10;
                }
            } else if (numero >= 40) {
                System.out.print("XL");
                numero -= 40;
            } else {
                while (numero >= 10) {
                    System.out.print("X");
                    numero -= 10;
                }
            }
            if (numero == 9) {
                System.out.print("IX");
                numero -= 9;
            } else if (numero >= 5) {
                System.out.print("V");
                numero -= 5;
                while (numero >= 1) {
                    System.out.print("I");
                    numero -= 1;
                }
            } else if (numero == 4) {
                System.out.print("IV");
                numero -= 4;
            } else {
                while (numero >= 1) {
                    System.out.print("I");
                    numero -= 1;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
