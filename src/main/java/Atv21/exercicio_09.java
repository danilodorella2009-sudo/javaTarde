package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("MENU DE PRODUTOS");
            System.out.println("1 - Adicionar preço");
            System.out.println("2 - Listar todos os preços");
            System.out.println("3 - Listar preços maiores que X");
            System.out.println("4 - Limpar lista");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.print("Digite o preço: ");
                double preco = sc.nextDouble();
                precos.add(preco);
                System.out.println("Preço adicionado com sucesso!");
            }
            else if (opcao == 2) {
                System.out.println("Lista de preços");
                for (double p : precos) {
                    System.out.println("R$ " + p);
                }
            }
            else if (opcao == 3) {
                System.out.print("Mostrar preços maiores que: ");
                double limite = sc.nextDouble();
                System.out.println("Preços maiores que R$ " + limite + " ");
                for (double p : precos) {
                    if (p > limite) {
                        System.out.println("R$ " + p);
                    }
                }
            }
            else if (opcao == 4) {
                precos.clear();
                System.out.println("Lista de preços limpa ");
            }
            else if (opcao == 0) {
                System.out.println("Saindo do programa ");
            }
            else {
                System.out.println("Opção inválida! Tente novamente ");
            }
        } while (opcao != 0);
        sc.close();
    }
}