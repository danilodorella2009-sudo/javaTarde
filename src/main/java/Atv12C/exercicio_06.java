package Atv12C;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do depósito");
        double n1 = sc.nextDouble();
        System.out.println("Digite a taxa de juro (%): ");
        double taxa= sc.nextDouble();
        double rendimento= n1*(taxa/100);
        double total= n1+rendimento;
        System.out.println("O rendimento após um mês é:" +rendimento);
        System.out.println("A taxa de juros mensal é:" +taxa);
        sc.close();

    }
}
