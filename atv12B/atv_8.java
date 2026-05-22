package atv12B;

import java.util.Scanner;

public class atv_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        int x = sc.nextInt();
        System.out.println("Insira o segundo numero");
        int y = sc.nextInt();
        int cal = x / y;
        int resto = x % y;
        System.out.println("o valor da divisao é:" + cal);
        System.out.println(" o resto da divisao é:" + resto);
        sc.close();
    }
}
