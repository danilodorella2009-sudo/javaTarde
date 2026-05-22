package atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digites os nome (digite FIM para encerrar): ");
        ArrayList<String> nomes = new ArrayList<>();
        String nome;
        while (true) {
            nome = sc.nextLine().trim();
            if (nome.equalsIgnoreCase("Fim")) {
                break;
            }
            String comparar = nome.toLowerCase();
            boolean existe = false;
            for (String n : nomes) {
                if (n.toLowerCase().equalsIgnoreCase(comparar)) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                System.out.println("Esse nome já foi cadastrado na lista ");
            } else {
                nomes.add(nome);
                System.out.println("Nome adicionado ");
            }
        }
        System.out.println("Lista final de nomes: ");
        for (String n : nomes) {
            System.out.println("- " + n);
        }
        sc.close();
    }
}
