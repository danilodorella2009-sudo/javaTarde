package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura");
        int temperatura = sc.nextInt();
        String resultado = max(temperatura);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int temperatura) {
        String acao;
        if (temperatura < 0) {
            acao = "alerta congelamento";
        } else if (temperatura <= 40) {
            acao = "temperatura normal";
        } else {
            acao = "alerta superaquecimento";
        }
        return acao;
    }
}
