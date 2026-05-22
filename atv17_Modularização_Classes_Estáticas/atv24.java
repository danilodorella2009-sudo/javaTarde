package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de produtos no estoque: ");
        int produto = sc.nextInt();
        String resultado = max(produto);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int produto){
        String acao;
        if (produto < 10) {
            acao = ("Reabastecer urgente");
        } else if (produto <= 30) {
           acao = ("Alerta");
        } else {
          acao = ("Normal");
        }
        return acao;
    }
}
