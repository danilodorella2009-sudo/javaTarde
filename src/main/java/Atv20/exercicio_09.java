package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os e-mails separados por vírgula:");
        String linha = sc.nextLine();

        String[] emails = linha.split(",");

        for (int i = 0; i < emails.length; i++) {
            emails[i] = emails[i].trim().toLowerCase();
        }

        System.out.println("\nTodos os e-mails (normalizados):");
        for (String email : emails) {
            System.out.println(email);
        }

        String[] unicos = new String[emails.length];
        int contadorUnicos = 0;

        for (String email : emails) {
            boolean jaExiste = false;

            for (int i = 0; i < contadorUnicos; i++) {
                if (email.equals(unicos[i])) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                unicos[contadorUnicos] = email;
                contadorUnicos++;
            }
        }

        System.out.println("E-mails únicos:");
        for (int i = 0; i < contadorUnicos; i++) {
            System.out.println(unicos[i]);
        }

        sc.close();
    }
}
