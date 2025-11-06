package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[20];
        int count = 0;
        int opcao;

        do {
            System.out.println(" MENU ");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar todos os nomes");
            System.out.println("3 - Listar nomes que começam com uma letra");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                if (count < nomes.length) {
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    nomes[count] = nome;
                    count++;
                    System.out.println("Nome cadastrado com sucesso!");
                } else {
                    System.out.println("Limite de cadastros atingido (20 nomes).");
                }

            } else if (opcao == 2) {

                System.out.println(" Lista de nomes cadastrados ");
                if (count == 0) {
                    System.out.println("Nenhum nome cadastrado ainda.");
                } else {
                    for (String nome : nomes) {
                        if (nome != null) {
                            System.out.println(nome);
                        }
                    }
                }

            } else if (opcao == 3) {

                if (count == 0) {
                    System.out.println("Nenhum nome cadastrado para filtrar.");
                } else {
                    System.out.print("Digite a letra inicial: ");
                    String letra = sc.nextLine().toLowerCase();

                    System.out.println(" Nomes que começam com '" + letra);
                    boolean encontrou = false;
                    for (String nome : nomes) {
                        if (nome != null && nome.toLowerCase().startsWith(letra)) {
                            System.out.println(nome);
                            encontrou = true;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Nenhum nome encontrado com essa letra.");
                    }
                }

            } else if (opcao == 0) {
                System.out.println("Encerrando o programa...");

            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}