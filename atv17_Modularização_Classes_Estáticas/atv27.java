package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tempo de erro (crítico, moderado, nenhum): ");
        String erro = sc.nextLine();
        String resultado = max(erro);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(String erro) {
        String acao;
        if (erro.equalsIgnoreCase("critico")) {
            acao = ("Parar linha");
        } else if (erro.equalsIgnoreCase("moderado")) {
            acao = ("Acionar manutenção");
        } else if (erro.equalsIgnoreCase("Nenhum")) {
            acao = ("Continuar produção");
        } else {
            acao = ("Entrada inválida");
        }
        return acao;
    }
}
