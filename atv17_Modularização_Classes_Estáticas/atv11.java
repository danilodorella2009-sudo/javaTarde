package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        System.out.println("digite o nivel do drone");
        int bate = sc.nextInt();
        String resultado = max(bate);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int bate){
        String acao;
        if (bate < 20) {
            acao = ("retorno imediato");
        } else if (bate <= 60) {
            acao = ("rota curta");
        } else {
            acao = ("rota longa");
        }
        return acao;
    }
}
