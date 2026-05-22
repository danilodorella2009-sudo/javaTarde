package atv12B;

import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int x = sc.nextInt();
        System.out.println();
        System.out.println("digite o segundo numero");
        int y = sc.nextInt();
        System.out.println();
        int soma = x + y;
        System.out.println("SOMA" + soma);
        sc.close();


    }
}
