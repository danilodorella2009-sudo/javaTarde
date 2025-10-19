package Atv14;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println(numero % 3 == 0 ? "Divisível " : "Não é divisilvel");
        sc.close();
    }
}
