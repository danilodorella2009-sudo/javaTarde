package Atv14;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println(numero > 0 ? "Positivo" : "Negativo");
        sc.close();
    }
}
