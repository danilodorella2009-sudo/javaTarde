package atv12C;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int x = sc.nextInt();
        int cal = x* 365;
        System.out.println("A quantidade de dias que vc ja viveu é: " + cal);
        sc.close();

    }
}
