package Atv14;

import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.print("Digite o valor por hora: ");
        double valorHora = sc.nextDouble();
        double salario19 = horas * valorHora;

        System.out.println(salario19 > 2000 ? " Salário bom " : " Salário ruim ");
        sc.close();
    }
}
