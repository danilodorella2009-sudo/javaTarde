package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("O robô A está funcionando ? ");
        String robo = sc.nextLine();
        String resultado = max(robo);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(String robo) {
        String acao;
        if (robo.equalsIgnoreCase("sim")) {
            acao = ("Continuar o trabalho");
        } else {
            acao = ("O robô B esta funcionando ? ");
        }
        if (robo.equalsIgnoreCase("sim")) {
            acao = ("Acionar o robô B ");
        } else {
            acao = ("Parar a linha ");
        }
        return acao;
    }
}
