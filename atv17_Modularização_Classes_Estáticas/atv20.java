package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horario do seu turno: ");
        int turnos = sc.nextInt();
        String resultado = max(turnos);
        System.out.println(resultado);
        sc.close();
    }
    public static String max(int turnos){
        String acao;
        if (turnos < 12) {
            acao = ("Manhã");
        } else if (turnos <= 18) {
           acao = ("Tarde");
        } else {
            acao = ("Noite");
        }
        return acao;
    }
}
