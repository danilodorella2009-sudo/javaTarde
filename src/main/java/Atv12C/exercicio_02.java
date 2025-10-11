package Atv12C;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a quantidade de horas");
        int x=sc.nextInt();
        int minutos= x*60;
        System.out.println("A converçâo em minutos é:" +minutos);
        sc.close();
    }
}
