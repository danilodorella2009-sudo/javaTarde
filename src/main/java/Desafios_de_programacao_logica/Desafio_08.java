package Desafios_de_programacao_logica;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        int decimal = sc.nextInt();
        String binario;
        int num = decimal;
        if (num == 0) {
            binario = "0";
        } else {
            StringBuilder binarioBuilder = new StringBuilder();
            while (num > 0) {
                int resto = num % 2;
                binarioBuilder.insert(0, resto);
                num = num / 2;
            }
            binario = binarioBuilder.toString();
        }
        System.out.println("Representação binária de " + decimal + " é: " + binario);
        sc.close();
    }
}
