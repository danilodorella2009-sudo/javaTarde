package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        String nome;

        System.out.println("Digite os nomes (digite 'FIM' para encerrar):");


        while (true) {
            nome = sc.nextLine().trim();

            if (nome.equalsIgnoreCase("FIM")) {
                break;
            }
            String nomeComparacao = nome.toLowerCase();

            boolean existe = false;
            for (String n : nomes) {
                if (n.toLowerCase().equals(nomeComparacao)) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                nomes.add(nome);
            } else {
                System.out.println("Nome já cadastrado, tente outro!");
            }
        }
        System.out.println("Lista de presença:");
        for (String n : nomes) {
            System.out.println("- " + n);
        }
        sc.close();
    }
}