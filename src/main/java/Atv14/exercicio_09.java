package Atv14;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println(a > b ? a + " É maior " : (a < b ? b + " é maior " : "Números iguais"));
        sc.close();
    }
}
