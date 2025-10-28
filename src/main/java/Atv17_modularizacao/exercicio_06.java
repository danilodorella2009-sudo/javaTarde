package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância do obstáculo em metros:");
        int distancia = sc.nextInt();

        String resultado=max(distancia);
        System.out.println(resultado);
    }

    public static String max(int distancia) {
        String acao;
        if (distancia < 5) {
            acao = "Frear";
        } else if (distancia <= 15) {
            acao = "Reduzir velocidade";
        } else {
            acao = "Acelerar";
        }
        return acao;
    }
}
