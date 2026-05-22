package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nível de energia do robô: ");
        int tinta = sc.nextInt();
        String resultado = max(tinta);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int tinta) {
        String acao;
        if (tinta < 15) {
            acao = ("Parar");
        } else if (tinta <= 50) {
            acao = ("Alerta");
        } else {
            acao = ("Continuar");
        }
        return acao;
    }
}
