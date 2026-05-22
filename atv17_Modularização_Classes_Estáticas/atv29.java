package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv29 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o percentual de defeitos: ");
        int inspecao = sc.nextInt();
        String resultado = max(inspecao);
        System.out.println(resultado);
        sc.close();
    }
    public static String max(int inspecao){
        String acao;
        if (inspecao > 20) {
            acao = ("Reprovar");
        } else if (inspecao >= 10) {
            acao = ("Retrabalho");
        } else {
            acao = ("Aprovar");
        }
        return acao;
    }
}
