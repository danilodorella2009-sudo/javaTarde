package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de erro (critico, moderado, nenhum):");
        String erro = sc.next();
        String resultado = max(erro);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(String erro) {
        String acao;

        if (erro.equalsIgnoreCase("critico")) {
            acao = "Parar linha de produção";
        } else if (erro.equalsIgnoreCase("moderado")) {
            acao = "Acionar manutenção";
        } else if (erro.equalsIgnoreCase("nenhum")) {
            acao = "Continuar produção";
        } else {
            acao = "Tipo de erro inválido";
        }
        return acao;
    }
}
