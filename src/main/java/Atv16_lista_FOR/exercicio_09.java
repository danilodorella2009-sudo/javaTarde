package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int soma = 0, previsao;
        double media;
        for (int d = 0; d <= 31; d++) {
            previsao = random.nextInt(1001);
            System.out.println("Previsão de damanda para o dia: " + d + " foram feitas " + previsao + " unidades");
            soma += previsao;
        }
        media = soma / 31;
        System.out.println("A média de unidade produzidas foram de: " + media);
        sc.close();
    }
}
