package Atv14;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println(numero % 2 == 0 ? "Par" : "Ímpar");
        sc.close();
    }
}
