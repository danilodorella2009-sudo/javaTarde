package atv12C;

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        double x = sc.nextDouble();
        double cal = x - (x * 0.15);
        System.out.println("O valor do produto com o desconto é: " + cal);
        sc.close();

    }
}
