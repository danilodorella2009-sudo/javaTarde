package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nível de energia solar: ");
        int solar = sc.nextInt();
        String resultado = max(solar);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int solar) {
        String acao = "";
        if (solar > 70) {
            acao = ("Usar energia solar");
        } else if (solar <= 70) {
            acao = ("Híbrido");
        } else if (solar <= 30) {
            acao = ("Usar rede elétrica");
        }
        return acao;
    }
}
