package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();


        String[] palavras = frase.split("\\s+");

        System.out.println("--- Palavras limpas ---");
        for (String p : palavras) {

            String limpa = p.replaceAll("[.,;!?]", "");
            System.out.println(limpa);
        }

        sc.close();
    }
}
