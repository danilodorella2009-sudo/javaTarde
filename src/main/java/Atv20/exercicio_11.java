package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os itens no formato nome: categoria separados por vírgula: ");
        System.out.println("Exemplo: arroz:alimento,detergente:limpeza,banana:alimento");
        String entrada = sc.nextLine();

        String[] itens = entrada.split(",");

        System.out.println(" Todos os Itens ");
        for (String item : itens) {
            String[] partes = item.split(": ");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String categoria = partes[1].trim();
                System.out.println("Nome: " + nome + " | Categoria: " + categoria);
            } else {
                System.out.println("Formato inválido em: " + item);
            }
        }
        System.out.print("Digite a categoria que deseja filtrar: ");
        String categoriaEscolhida = sc.nextLine().trim();

        System.out.println("Itens da categoria '" + categoriaEscolhida);
        boolean encontrou = false;
        for (String item : itens) {
            String[] partes = item.split(":");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String categoria = partes[1].trim();

                if (categoria.equalsIgnoreCase(categoriaEscolhida)) {
                    System.out.println("Nome: " + nome);
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum item encontrado nessa categoria.");
        }

        sc.close();
    }
}