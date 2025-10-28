package Atv18;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Verificador de Números Primos");
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        boolean primo = VerificadorPrimo.ePrimo(numero);
        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        sc.close();
    }

    class VerificadorPrimo {
        public static boolean ePrimo(int n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}

