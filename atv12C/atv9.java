package atv12C;

import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base maior");
        double B = sc.nextDouble();
        System.out.println("Digite o valor da base menor");
        double b = sc.nextDouble();
        System.out.println("Digite a altura do trapezio");
        double h = sc.nextDouble();
        double cal = (B+b)*h/2;
        System.out.println("A area do trapezio é: " + cal);
        sc.close();
    }
}
