package atv20;

import java.util.Locale;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos códigos serão digitados");
        int n = sc.nextInt();
        sc.nextLine();
        String[] codigos = new String[n];
        for (int i = 0; i < codigos.length; i++) {
            System.out.println("Digite o codigo #" + (i + 1) + ":");
            codigos[i] = sc.nextLine();
        }
        String alvo;
        do {
            System.out.println("\nDigite o código a buscar (ou 'sair' para encerrar");
            alvo = sc.nextLine();
            if (!alvo.equalsIgnoreCase("SAIR")) {
                int cont = 0;
                for (String c : codigos) {
                    if (c.equalsIgnoreCase(alvo)) {
                        cont++;
                    }
                }
                System.out.println("O código " + alvo + " aparece " + cont + " vez");
            }

        } while (!alvo.equalsIgnoreCase("SAIR"));
        System.out.println("\nPrograma encerrado");
        sc.close();
    }
}
