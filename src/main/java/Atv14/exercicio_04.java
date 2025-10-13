package Atv14;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = sc.nextDouble();

        System.out.println(temperatura < 18 ? "Frio" : "Quente");
        sc.close();

    }
}
