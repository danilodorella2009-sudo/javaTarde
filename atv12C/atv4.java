package atv12C;

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double x = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        double y = sc.nextDouble();
        double cal = (x * 3 + y * 2) / 5;
        System.out.println("A media ponderada é " + cal);
        sc.close();

    }
}
