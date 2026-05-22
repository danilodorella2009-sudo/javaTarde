package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ddigite o indice de partículas: ");
        int particulas = sc.nextInt();
        String resultado = max(particulas);
        System.out.println(resultado);
        sc.close();
    }
    public static String max(int particulas){
        String acao;
        if (particulas < 50) {
           acao = ("Moderado");
        } else if (particulas <= 100) {
            acao = ("Ruim");
        } else {
           acao = ("Crítico");
        }
        return acao;
    }
}
