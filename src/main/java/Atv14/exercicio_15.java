package Atv14;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade :");
        int idade = sc.nextInt();

        System.out.println(idade >= 16 ? "Pode votar" : "Não pode votar");
        sc.close();
    }
}
