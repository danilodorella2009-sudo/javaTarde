package atv12C;

import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito");
        double deposito = sc.nextInt();
        System.out.println("DIgite o valor da taxa de juros mensal");
        double taxa = sc.nextDouble();
        double rendimento = deposito * (taxa / 100);
        double valorTotal = deposito + rendimento;
        System.out.println("rendimento apos 1 mês: " + rendimento);
        System.out.println("A taxa de juros é: " + taxa);

    }
}
