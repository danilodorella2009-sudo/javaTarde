package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double media, eficiencia, soma = 0;
        for (int i = 1; i < 100; i++) {
            System.out.println("Digite a eficiencia da maquina " + i + ":");
            eficiencia = sc.nextDouble();
            soma += eficiencia;
            System.out.println(media = soma / 100);
            System.out.println("Media de eficiencia das maquinas: " + media + "%");
        }
        sc.close();
    }
}
