package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tipo de defeito (visivel / microscopico / ausente): ");
        String defeitos = sc.nextLine();
        String resultado = max(defeitos);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(String defeitos) {
        String acao;
        if (defeitos.equalsIgnoreCase("visivel")) {
            acao = ("Nível de defeito: ALTO");
        } else if (defeitos.equalsIgnoreCase("microscopico")) {
            acao = ("Nível de defeito: MEDIO");
        } else if (defeitos.equalsIgnoreCase("ausente")) {
            acao = ("Nível de defeito: BAIXO");
        } else {
            acao = ("Tipo de defeito inválido.");
        }
        return acao;
    }
}
