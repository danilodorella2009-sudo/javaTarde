package atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores das compras (0 para encerrar): ");
        ArrayList<Double> gastos = new ArrayList<>();
        double valor;
        do {
            valor = sc.nextDouble();
            if (valor != 0) {
                gastos.add(valor);
            }
        } while (valor != 0);
        double soma = 0;
        for (double g : gastos) {
            soma += g;
        }
        double media = 0;
        if (gastos.size() > 0) {
            media = soma / gastos.size();
        }
        System.out.println("Lista de gastos: ");
        for (double g : gastos) {
            System.out.println("R$ " + g);
        }
        System.out.println("Total gasto: R$ " + soma);
        System.out.println("Média dos gastos: R$ " + media);
        sc.close();
    }
}
