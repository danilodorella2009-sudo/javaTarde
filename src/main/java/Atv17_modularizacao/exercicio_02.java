package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo das peças de: (1 a 4)");
        int codigo = sc.nextInt();

        System.out.println(max(codigo));

        sc.close();
    }

    public static String max(int codigo) {
        String acao;
        if (codigo == 1) {
            acao = "Peça aprovada";
        } else if (codigo == 2) {
            acao = "Peça reprovada";
        } else if (codigo == 3) {
            acao = "Peça retrabalho";
        } else if (codigo == 4) {
            acao = "Peça em análise manual";
        } else {
            acao = "Código inválido";
        }
        return acao;
    }
}
