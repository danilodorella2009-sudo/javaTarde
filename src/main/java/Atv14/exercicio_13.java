package Atv14;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        int salario = sc.nextInt();

        System.out.println(salario > 3000 ? "Salário alto" : "Salário baixo");
        sc.close();
    }
}
