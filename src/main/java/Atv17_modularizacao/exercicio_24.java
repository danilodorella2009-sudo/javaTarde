package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de unidades em estoque:");
        int quantidade = sc.nextInt();
        String resultado = max(quantidade);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int quantidade) {
        String acao;

        if (quantidade < 10) {
            acao = "Reabastecer urgente";
        } else if (quantidade <= 30) {
            acao = "Alerta de estoque";
        } else {
            acao = "Estoque normal";
        }
        return acao;
    }
}
