package Inteligente_Controle.Applicaton;

import Inteligente_Controle.Entities.produto;

import Inteligente_Controle.Entities.produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos deseja cadastrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        produto[] produtos = new produto[n];

        for (int i = 0; i < n; i++) {

            System.out.println(" Produto " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade no estoque: ");
            int quantEstoque = sc.nextInt();
            sc.nextLine();

            produtos[i] = new produto(nome, preco, quantEstoque);
        }

        System.out.println(" === DADOS DOS PRODUTOS === ");

        for (int i = 0; i < n; i++) {
            System.out.println(produtos[i]);
        }

        sc.close();
    }
}