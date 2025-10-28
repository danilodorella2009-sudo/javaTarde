package Atv18;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Conversor de Moeda ");
        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1 - Real para Dólar");
        System.out.println("2 - Real para Euro");
        System.out.println("3 - Dólar para Real");
        System.out.println("4 - Euro para Real");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine(); // limpar buffer
        System.out.print("Digite o valor a ser convertido: ");
        String entrada = sc.nextLine();
        String[] partes = entrada.trim().split("\\s+");
        double valor = Double.parseDouble(partes[0]);
        double resultado;
        if (opcao == 1) {
            resultado = ConversorMoeda.realParaDolar(valor);
            System.out.printf("R$ %.2f = $ %.2f%n", valor, resultado);
        } else if (opcao == 2) {
            resultado = ConversorMoeda.realParaEuro(valor);
            System.out.printf("R$ %.2f = € %.2f%n", valor, resultado);
        } else if (opcao == 3) {
            resultado = ConversorMoeda.dolarParaReal(valor);
            System.out.printf("$ %.2f = R$ %.2f%n", valor, resultado);
        } else if (opcao == 4) {
            resultado = ConversorMoeda.euroParaReal(valor);
            System.out.printf("€ %.2f = R$ %.2f%n", valor, resultado);
        } else {
            System.out.println("Opção inválida!");
        }
        sc.close();
    }

    class ConversorMoeda {
        private static final double COTACAO_DOLAR = 5.2;
        private static final double COTACAO_EURO = 5.8;

        public static double realParaDolar(double r) {
            return r / COTACAO_DOLAR;
        }

        public static double realParaEuro(double r) {
            return r / COTACAO_EURO;
        }

        public static double dolarParaReal(double d) {
            return d * COTACAO_DOLAR;
        }

        public static double euroParaReal(double e) {
            return e * COTACAO_EURO;
        }
    }
}
