package atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os codigos separados por virgula: ");
        String linha = sc.nextLine();

        ArrayList<String> codigos = new ArrayList<>();
        String[] partes = linha.split(",");
        for (String c : partes) {
            c = c.trim();
            if (c.isEmpty()) {
                codigos.add(c);
            }
        }
        String alvo;

        do {
            System.out.println("\nDigite um codigo paara buscar(ou SAIR para encerrar o programa): ");
            alvo = sc.nextLine().trim();

            if (!alvo.equalsIgnoreCase("SAIR")) {
                int cont = 0;
                for (String c : codigos) {
                    if (c.equalsIgnoreCase(alvo)) {
                        cont++;
                    }
                }
                if (cont > 0) {
                    System.out.println("O código " + alvo + "aparece " + cont + "vez");
                } else {
                    System.out.println("O código " + alvo + "não foi encotrado");
                }
            }
        } while (!alvo.equalsIgnoreCase("SAIR"));
        System.out.println("Programa encerrado");
        sc.close();
    }
}
