package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

public class atv14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de itens detectados: ");
        int velocidade = sc.nextInt();
        String resultado = max(velocidade);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int velocidade) {
        String acao;
        if (velocidade < 10) {
            acao = ("Lento");
        } else if (velocidade <= 20) {
            acao = ("Média");
        } else {
            acao = ("Rápida");
        }
        return acao;
    }
}
