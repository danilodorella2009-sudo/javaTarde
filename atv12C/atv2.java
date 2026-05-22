package atv12C;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("coloca a quantidade de horas");
        int x = sc.nextInt();
        int cal = x*60;
        System.out.println("A conversão em minutos é: " + cal);
        sc.close();
    }
}
