package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro (até 7 digitos): ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        int original = numero;
        int invertido = 0;
        while (numero > 0) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
        }
        if (original == invertido) {
            System.out.println("O numero é um palindromo!");
        } else {
            System.out.println("O numero NÃO é um palindromo.");
        }
        boolean ehPalindromo = true;
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break;
            }
        }
        if (ehPalindromo) {
            System.out.println("A palavra é um palíndormo!");
        } else {
            System.out.println("A palavra NÃO é um palíndromo");
        }
        sc.close();
    }
}
