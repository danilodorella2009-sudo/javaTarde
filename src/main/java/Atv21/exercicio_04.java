package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();

        String[] palavrasSeparadas = texto.split("\\s+");

        ArrayList<String> palavras = new ArrayList<>();

        for (String p : palavrasSeparadas) {
            p = p.trim();
            if (!p.isEmpty()) {
                palavras.add(p);
            }
        }
        System.out.println("Palavras com até 4 letras: ");
        for (String p : palavras) {
            if (p.length() <= 4) {
                System.out.println(p);
            }
        }
        sc.close();
    }
}
