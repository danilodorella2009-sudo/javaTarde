package Atv14;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = sc.nextDouble();
        double imposto = salario > 5000 ? salario * 0.2 : salario * 0.1;

        System.out.println("Imposto: " + imposto);
        sc.close();
    }
}
