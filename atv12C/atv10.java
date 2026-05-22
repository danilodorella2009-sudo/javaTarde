package atv12C;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura");
        double h = sc.nextDouble();
        double cal = (72.7 * h) - 58;
        System.out.println("o peso ideal é: " + cal);
        sc.close();

    }
}
