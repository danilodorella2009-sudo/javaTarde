package Atv12C;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double x=sc.nextInt();
        System.out.println("Digite o segundo numero");
        double y=sc.nextInt();
        double media= (x*3 + y*2)/5;
        System.out.println("A media ponderada é:" +media);
        sc.close();
    }
}
