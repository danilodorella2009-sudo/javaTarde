package Atv14;

import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.println(temperatura > 30 ? "Quente" : "Frio");
        sc.close();
    }
}
