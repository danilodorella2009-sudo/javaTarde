package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos termos da sequência de Fibonacci deseja gerar: ");
        int n = sc.nextInt();
        long a = 0, b = 1;
        System.out.println(" Sequência Mágica de Fibonacci:");
        for (int i = 1; i <= n; i++) {
            long termo = a;
            boolean primo = true;
            if (termo < 2) {
                primo = false;
            } else {
                for (int j = 2; j <= termo / 2; j++) {
                    if (termo % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.print(termo + "* ");
            } else {
                System.out.print(termo + " ");
            }
            long proximo = a + b;
            a = b;
            b = proximo;
        }
        sc.close();
    }
}

