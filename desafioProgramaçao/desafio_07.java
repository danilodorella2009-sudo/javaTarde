package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite o primeiro numero: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = sc.nextInt();
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        System.out.println("O Maximo Divisor comum (MDC) é: " + a);
        sc.close();
    }
}
