package atv20;

import java.util.Locale;
import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os itens no formato nome: categoria separados por vírgula: ");
        String linha = sc.nextLine();
        String[] itens = linha.split(",");
        System.out.println("\nTodos os itens:");
        for (String item : itens) {
            String[] partes = item.split(":");
            String nome = partes[0].trim();
            String categoria = partes[1].trim();
            System.out.println(nome + "(" + categoria + ")");
        }
        System.out.println("\nDigite a categoria que deseja filtrar: ");
        String filtro = sc.nextLine().trim().toLowerCase();
        System.out.println("\nItens da categoria " + filtro + ":");
        for (String item : itens) {
            String[] partes = item.split(":");
            String nome = partes[0].trim();
            String categoria = partes[1].trim().toLowerCase();
            if (categoria.equals(filtro)) {
                System.out.println(nome);
            }
        }
        sc.close();
    }
}
