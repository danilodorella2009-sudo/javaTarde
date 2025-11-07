package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        System.out.println("Digite palavras (digite 'fim' para encerrar):");
        while (true) {
            String palavra = sc.nextLine();
            if (palavra.equalsIgnoreCase("fim")) break;
            palavras.add(palavra);
        }
        System.out.print("Digite o tamanho mínimo permitido: ");
        int min;
        if (sc.hasNextInt()) {
            min = sc.nextInt();
        } else {
            System.out.println("Entrada inválida! Encerrando o programa.");
            sc.close();
            return;
        }
        palavras.removeIf(p -> p.length() < min);
        System.out.println("\nPalavras que permaneceram:");
        for (String p : palavras) {
            System.out.println(p);
        }
        sc.close();
    }
}
