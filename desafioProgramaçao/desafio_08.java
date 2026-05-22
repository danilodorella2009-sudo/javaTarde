package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Conversor de Bases");
        System.out.println(" Decimal para Binario (1)");
        System.out.println(" Binario para Decimal (2)");
        System.out.println("Escolha uma opção");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Digite um numero decimal: ");
            int decimal = sc.nextInt();
            String binario = "";

            int numero = decimal;
            if (numero == 0) {
                binario = "0";
            } else {
                while (numero > 0) {
                    int resto = numero % 2;
                    binario = resto + binario;
                    numero = numero / 2;
                }
            }
            System.out.println("O numero " + decimal + " em binario é: " + binario);
        } else if (opcao == 2) {
            System.out.print("Digite um numero binario: ");
            String binario = sc.next();
            int decimal = 0;
            int potencia = 1;
            for (int i = binario.length() - 1; i >= 0; i--) {
                char digito = binario.charAt(i);
                if (digito == '1') {
                    decimal += potencia;
                }
                potencia *= 2;
            }
            System.out.println("O numero binario " + binario + " em decimal é " + decimal);
        } else {
            System.out.println("Opção invalida!");
        }
        sc.close();
    }
}