package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] codigos = {"A12", "B07", "A12", "C03"};

        String alvo;


        do {
            System.out.print("Digite o código que deseja buscar (ou SAIR para encerrar): ");
            alvo = sc.nextLine();

            if (!alvo.equalsIgnoreCase("SAIR")) {
                int cont = 0;

                // Percorre o vetor com for-each
                for (String codigo : codigos) {
                    if (codigo.equalsIgnoreCase(alvo)) {
                        cont++;
                    }
                }


                if (cont > 0) {
                    System.out.println("O código " + alvo + " aparece " + cont + " vez(es).");
                } else {
                    System.out.println("O código " + alvo + " não foi encontrado.");
                }
            }

        } while (!alvo.equalsIgnoreCase("SAIR"));

        System.out.println("Encerrando o programa...");
        sc.close();
    }
}