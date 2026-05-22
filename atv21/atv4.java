package atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        ArrayList<String> palavras = new ArrayList<>();
        String[] partes = texto.split("\ns+");

        for (String p : partes) {
            p = p.trim();
            if (!p.isEmpty()) {
                palavras.add(p);
            }
        }
        System.out.println("\nPalavras com até 4 letras:");
        for (String p : palavras) {
            if (p.length() <= 4) {
                System.out.println(p);
            }
        }
        sc.close();
    }
}
