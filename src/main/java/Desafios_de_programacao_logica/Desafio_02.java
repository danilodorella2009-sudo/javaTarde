package Desafios_de_programacao_logica;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 399: ");
        int numero = sc.nextInt();
        if (numero < 1 || numero > 399) {
            System.out.println("Número fora do limite permitido ");
            return;
        }
        String romano = "";
        while (numero >= 100) {
            romano += "C";
            numero -= 100;
        }
        if (numero >=90) {
            romano +="XC;";
            numero -= 90;
        }
        while (numero >= 50) {
            romano +="L";
            numero -=50;
        }
        if (numero>=40) {
            romano += "XL";
            numero -= 40;
        }
        while (numero>=10) {
            romano += "X";
            numero -= 10;
        }
        if (numero>=9) {
            romano += "IX";
            numero -= 9;
        }
        while (numero >=5) {
            romano += "V";
            numero -= 5;
        }
        if (numero>=4) {
            romano += "IV";
            numero -= 4;
        }
        while (numero>=1) {
            romano += "I";
            numero -= 1;
        }
        System.out.println("Número em romano: "+romano);
        sc.close();
    }
}
