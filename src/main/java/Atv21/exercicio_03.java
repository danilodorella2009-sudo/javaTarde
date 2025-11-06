package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> gastos = new ArrayList<>();
        double valor;

        System.out.println("Digite os valores das compras (digite 0 para encerrar):");

        do {
            valor = sc.nextDouble();

            if (valor != 0) {
                gastos.add(valor);
            }

        } while (valor != 0);

        double soma = 0;
        for (double g : gastos) {
            System.out.println("Gasto: R$ " + g);
            soma += g;
        }
        if (gastos.size() > 0) {
            double media = soma / gastos.size();
            System.out.println("Total gasto: R$ " + soma);
            System.out.println("Média dos gastos: R$ " + media);
        } else {
            System.out.println("Nenhum gasto registrado.");
        }
        sc.close();
    }
}
