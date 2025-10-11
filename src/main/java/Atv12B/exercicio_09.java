package Atv12B;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite quantos anos voce tem");
        int x= sc.nextInt();
        int cal= x/12;
        System.out.println("A sua idade em meses é:" +cal);
        sc.close();
    }
}
