package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Digite os códigos (digite 'fim' para parar):");
        while (true) {
            String cod = sc.nextLine();
            if (cod.equalsIgnoreCase("fim")) break;
            lista.add(cod);
        }
        String alvo;
        do {
            System.out.print("Buscar código (ou SAIR): ");
            alvo = sc.nextLine();
            if (!alvo.equalsIgnoreCase("SAIR")) {
                int cont = 0;
                for (String c : lista)
                    if (c.equalsIgnoreCase(alvo))
                        cont++;
                if (cont > 0)
                    System.out.println("Encontrado " + cont + " vez(es).");
                else
                    System.out.println("Não encontrado.");
            }
        } while (!alvo.equalsIgnoreCase("SAIR"));
    }
}
