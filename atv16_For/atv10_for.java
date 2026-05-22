package atv16_For;

import java.util.Locale;
import java.util.Scanner;

public class atv10_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Aperte a tecla ENTER para começar o programa");
        sc.nextLine();
        System.out.println("Digite a nota minima para a aprovaçao");
        int n1 = sc.nextInt();
        System.out.println("Quantos testes de qualidade voce quer registrar");
        int quantidade = sc.nextInt();
        int aprovados = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("O resultado do teste " + i + ":");
            int resultado = sc.nextInt();
            if (resultado >= n1) {
                aprovados++;
            }
        }
        double Ap = ((double) aprovados / quantidade) * 100;
        System.out.println("Total de embalagens testados: " + quantidade);
        System.out.println("Total de embalagens aprovados: " + aprovados);
        System.out.println("Porcentagem de embalagens aprovados: " + Ap);
        sc.close();
    }

}
