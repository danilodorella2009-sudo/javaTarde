package Atv12C;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int x= sc.nextInt();
        int dias= x*365;
        System.out.println("Você ja viveu aproximadamente:" +dias);
        sc.close();
    }
}
