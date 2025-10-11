package Atv15_exercicio_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int estoque = 500;
        int retirada = 20;
        int contador = 0;

        System.out.println("Iniciando moniteramento do estoque");

        while (estoque >= 100) {
            contador++;
            System.out.println("retirada n° " + contador + ": " + retirada + " unidades removidas");
            estoque -= retirada;
            System.out.println("Estoque atual: " + estoque + " unidade");
        }
        System.out.println("Atenção! Estoque abaixo do nivel minimo: " + estoque + " unidade restantes");
        System.out.println("Total de retiradas realizadas: " +estoque);
        sc.close();
    }
}
