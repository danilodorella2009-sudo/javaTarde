package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o pH ? ");
        int pH = sc.nextInt();
        String resultado = max(pH);
        System.out.println(resultado);
        sc.close();
    }
    public static String max(int pH){
        String acao;
        if (pH < 7) {
            acao = ("Ácido");
        } else if (pH == 7) {
           acao = ("Neutro");
        } else {
            acao = ("Básico");
        }
        return acao;
    }
}
