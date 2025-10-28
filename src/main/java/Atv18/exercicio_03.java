package Atv18;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Contador de Palavras ");
        System.out.println("Digite uma frase e o programa contará quantas palavras ela possui.");
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        int total = ContadorPalavras.contar(frase);
        System.out.println("A frase digitada contém " + total + " palavra(s).");
        sc.close();
    }
    class ContadorPalavras {
        public static int contar(String frase) {
            String[] palavras = frase.trim().split(" ");
            int contador = 0;
            int i = 0;
            while (i < palavras.length) {
                for (int j = 0; j < 1; j++) {
                    contador++;
                }
                i++;
            }
            return contador;
        }
    }
}


