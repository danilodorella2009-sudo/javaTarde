package _01_estrututraSequencial;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Qual seu numero de funcionario:");
        int nu= sc.nextInt();
        System.out.println("Qual seu numero de horas trabalhadas:");
        int h= sc.nextInt();
        System.out.println("qual o valor que voce recebe por hora:");
        double sa= sc.nextDouble();
        double cal= h*sa;
        System.out.println("o seu numero é:"+nu);
        System.out.println();
        System.out.println("O seu salaeio é:u$"+cal);
        sc.close();
    }
}
