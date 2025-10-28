package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de bateria do drone ");
        int bateria = sc.nextInt();
        String resultado = max(bateria);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int bateria) {
        String acao;

        if (bateria < 20) {
            acao = "Retorno imediato ";
        } else if (bateria <= 60) {
            acao = "Rota curta ";
        } else {
            acao = "Rota longa ";
        }
        return acao;
    }
}
