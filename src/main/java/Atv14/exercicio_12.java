package Atv14;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.println(idade > 18 ? "Maior de iade" : "Menor de idade");
        sc.close();
    }
}
