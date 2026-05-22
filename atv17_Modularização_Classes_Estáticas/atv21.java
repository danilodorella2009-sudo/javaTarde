package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ddigite o peso da carga: ");
        int carga = sc.nextInt();
        String resultado = max(carga);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int carga) {
        String acao;
        if (carga < 500) {
            acao = ("Permitido");
        } else if (carga <= 1000) {
            acao = ("Alerta");
        } else {
            acao = ("Proibido");
        }
        return acao;
    }
}
