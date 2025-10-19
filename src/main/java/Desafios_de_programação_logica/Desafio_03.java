package Desafios_de_programação_logica;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um número inteiro de até 7 dígitos: ");
        int numero = sc.nextInt();
        int original = numero;
        int invertido = 0;
        while (numero>0) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero /10;
        }
        if (original == invertido) {
            System.out.println("O número é um palíndromo ! ");
        }else {
            System.out.println("O número NÃO é um palíndromo.");
        }
        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();
        boolean ehPalindromo = true;
        int tamanho = palavra.length();
        for (int i=0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }
        if (ehPalindromo) {
            System.out.println("A palavra é um palíndromo !");
        }else {
            System.out.println("A palavra NÃO é um palíndromo ");
        }
        sc.close();
    }
}
