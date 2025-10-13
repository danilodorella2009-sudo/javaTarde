package Atv14;

import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int nummero = sc.nextInt();

        System.out.println(nummero % 5 == 0 ? "Múltiplo de 5" : "Não é múltiplo de 5");
        sc.close();
    }
}
