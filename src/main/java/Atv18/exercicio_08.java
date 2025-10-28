package Atv18;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Calculadora de Juros Compostos");
        System.out.print("Digite o valor inicial do investimento: ");
        double capital = sc.nextDouble();
        if (capital <= 0) {
            System.out.println("Valor inválido! O capital deve ser maior que zero.");
        } else {
            System.out.print("Digite a taxa de juros (% ao período): ");
            double taxa = sc.nextDouble();
            if (taxa < 0) {
                System.out.println("Taxa de juros inválida! Deve ser zero ou positiva.");
            } else {
                System.out.print("Digite o número de períodos: ");
                int periodos = sc.nextInt();
                if (periodos <= 0) {
                    System.out.println("Número de períodos inválido! Deve ser maior que zero.");
                } else {
                    double valorFinal = CalculadoraJurosCompostos.calcular(capital, taxa, periodos);
                    System.out.printf("O valor final do investimento é: %.2f%n", valorFinal);
                }
            }
        }
        sc.close();
    }

    class CalculadoraJurosCompostos {
        public static double calcular(double capital, double taxa, int periodos) {
            double montante = capital;
            int i = 0;
            while (i < periodos) {
                montante += montante * (taxa / 100);
                i++;
            }
            return montante;
        }
    }
}

