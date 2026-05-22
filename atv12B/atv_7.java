package atv12B;

import java.util.Scanner;

public class atv_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias");
        int x = sc.nextInt();
        int cal = x * 24;
        System.out.println("convertindo em horas é:" + cal + " horas");
        sc.close();

    }
}
