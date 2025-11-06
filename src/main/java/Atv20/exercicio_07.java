package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        class Produto {
            String nome;
            double preco;


            Produto(String nome, double preco) {
                this.nome = nome;
                this.preco = preco;
            }
        }

        Produto[] produtos = new Produto[3];


        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Preço do produto " + (i + 1) + ": ");
            double preco = sc.nextDouble();
            sc.nextLine();

            produtos[i] = new Produto(nome, preco);
        }

        System.out.println("--- Lista de Produtos ---");
        for (Produto p : produtos) {
            System.out.printf("%s - R$%.2f%n", p.nome, p.preco);
        }

        System.out.println("-- Produtos com preço > R$50 ---");
        for (Produto p : produtos) {
            if (p.preco > 50) {
                System.out.printf("%s - R$%.2f (caro)%n", p.nome, p.preco);
            }
        }

        sc.close();
    }
}
