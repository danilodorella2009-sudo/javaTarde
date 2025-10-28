package Atv18;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Calculadora Simples ");
        System.out.println("Digite os números");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println("Escolha a operação");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println(" Opção: ");
        int opçao = sc.nextInt();
        double resultado;
        if (opçao == 1) {
            resultado = Calculadora.somar(n1, n2);
            System.out.println("Resultado: " + resultado);
        } else if (opçao == 2) {
            resultado = Calculadora.subtrair(n1, n2);
            System.out.println("Resultado: " + resultado);
        } else if (opçao == 3) {
            resultado = Calculadora.multiplicar(n1, n2);
            System.out.println("Resultado: " + resultado);
        } else if (opçao == 4) {
            resultado = Calculadora.dividir(n1, n2);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Opção invalida!");
        }
        sc.close();
    }

    class Calculadora {
        public static double somar(double a, double b) {
            return a + b;
        }

        public static double subtrair(double a, double b) {
            return a - b;
        }

        public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            if (b == 0) {
                System.out.println("Errro: divisão por zero!");
                return 0;
            } else {
                return a / b;
            }
        }
    }
}
