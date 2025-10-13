package Atv14;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        String faixa = idade < 12 ? "Infantil" : (idade <= 18 ? "Juvenil" : "Adulto");
        System.out.println("" + faixa);
        sc.close();
    }
}
