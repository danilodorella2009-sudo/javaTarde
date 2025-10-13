package Atv14;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();

        System.out.println(nota >= 7 ? "Aprovado" : "Reprovado");
        sc.close();
    }
}
