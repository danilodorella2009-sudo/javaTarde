package Atv14;

import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println(n1 > n2 ? n1 + " é maior" : (n1 < n2 ? n2 + " é maior" : "Números iguais"));
        sc.close();
    }
}
