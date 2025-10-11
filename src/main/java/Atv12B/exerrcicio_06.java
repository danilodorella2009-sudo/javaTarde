package Atv12B;

import java.util.Scanner;

public class exerrcicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da tempretura em Celsius");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("O valor da temperatura é:" +f);
        sc.close();
    }

}
