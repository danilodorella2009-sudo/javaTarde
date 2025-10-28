package Atv18;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine(); // limpar buffer
        System.out.print("Digite a temperatura a ser convertida: ");
        String entrada = sc.nextLine();
        String[] partes = entrada.trim().split(" ");
        double temperatura = Double.parseDouble(partes[0]);
        double resultado;
        if (opcao == 1) {
            resultado = ConversorTemperatura.celsiusParaFahrenheit(temperatura);
            System.out.printf("%.2f °C = %.2f °F%n", temperatura, resultado);
        } else if (opcao == 2) {
            resultado = ConversorTemperatura.fahrenheitParaCelsius(temperatura);
            System.out.printf("%.2f °F = %.2f °C%n", temperatura, resultado);
        } else {
            System.out.println("Opção inválida!");
        }
        sc.close();
    }

    class ConversorTemperatura {
        public static double celsiusParaFahrenheit(double c) {
            return (c * 9 / 5) + 32;
        }

        public static double fahrenheitParaCelsius(double f) {
            return (f - 32) * 5 / 9;
        }
    }
}


