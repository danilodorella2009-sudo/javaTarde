package atv20;

import java.util.Locale;
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os e-mails separados por virgulas");
        String linha = sc.nextLine();
        String[] emails = linha.split(",");
        String[] unicos = new String[emails.length];
        int qtdUnicos = 0;
        System.out.println("\nE-mails normalizados: ");
        for (String e : emails) {
            String email = e.trim().toLowerCase();
            System.out.println(email);
            boolean jaExixte = false;
            for (String u : unicos) {
                if (u != null && u.equalsIgnoreCase(email)) {
                    jaExixte = true;
                    break;
                }
            }
            if (!jaExixte) {
                unicos[qtdUnicos] = email;
                qtdUnicos++;
            }
        }
        System.out.println("\nE-mails únicos");
        for (int i = 0; i < qtdUnicos; i++) {
            System.out.println(unicos[i]);
        }
        sc.close();
    }
}
