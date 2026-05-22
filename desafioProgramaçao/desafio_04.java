package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite o valor que deseja sacar: ");
        int valor = sc.nextInt();
        int ced50 = 0, ced10 = 0, ced2 = 0;
        if (valor % 2 != 0) {
            System.out.println("Valor inválido! O valor deve ser multiplo de 2.");
        } else {

            ced50 = valor / 50;
            valor = valor % 50;

            ced10 = valor / 10;
            valor = valor % 10;

            ced2 = valor / 2;
            valor = valor % 2;

            System.out.println("Distribuição de cedulas:");
            System.out.println("R$50: " + ced50 + " cédula(s)");
            System.out.println("R$10: " + ced10 + " cédula(s)");
            System.out.println("R$2: " + ced2 + " cédula(s)");
        }
        sc.close();
    }
}
