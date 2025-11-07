package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> fila = new ArrayList<>();
        System.out.println("Digite nomes (digite 'fim' para parar):");
        while (true) {
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("fim")) break;
            fila.add(nome);
        }
        System.out.print("Quantas rotações deseja fazer? ");
        int k = sc.nextInt();
        if (k < 0) {
            System.out.println("Valor inválido!");
        } else {
            for (int i = 0; i < k; i++) {
                if (!fila.isEmpty()) {
                    String primeiro = fila.remove(0);
                    fila.add(primeiro);
                }
            }
            System.out.println("Ordem final da fila");
            for (String nome : fila)
                System.out.println(nome);
        }
    }
}
