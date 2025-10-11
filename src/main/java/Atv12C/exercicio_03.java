package Atv12C;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("digite o preço do produto");
        int x= sc.nextInt();
        double desconto=(x*0.15);
        System.out.println("O valor com desconto é:" +desconto);
        sc.close();
    }
}
