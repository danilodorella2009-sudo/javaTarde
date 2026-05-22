package atv18;

import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Calculadora de Fatorial");
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        long resultado = CalculadoraFatorial.calcular(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado + ".");
        sc.close();
    }

    class CalculadoraFatorial {
        public static long calcular(int n) {
            long fatorial = 1;
            int i = n;
            while (i > 1) {
                fatorial *= i;
                i--;
            }
            return fatorial;
        }
    }
}

