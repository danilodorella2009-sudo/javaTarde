package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a intensidade elétrica (A):");
        int intensidade = sc.nextInt();
        String resultado = max(intensidade);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int intensidade) {
        String acao;

        if (intensidade < 100) {
            acao = "Intensidade fraca";
        } else if (intensidade <= 200) {
            acao = "Intensidade média";
        } else {
            acao = "Intensidade forte";
        }
        return acao;
    }
}
