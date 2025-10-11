package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o numero de funcionarios:");
        int a = (int) sc.nextDouble();
        System.out.println("Digite as horas trabalhadas:");
        double y= sc.nextDouble();
        System.out.println("Valor que recebe por horas:");
        double z= sc.nextDouble();
        double soma= (y*z);
        System.out.println("number é:" +a);
        System.out.println("Salary é:" +soma);
    }
}
