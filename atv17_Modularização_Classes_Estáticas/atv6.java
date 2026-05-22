package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distancia detectada pelo sensor");
        int sensor = sc.nextInt();
        String resultado = max(sensor);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int sensor) {
        String acao;
        if (sensor < 5) {
            acao = "Precisa frear";
        } else if (sensor <= 15) {
            acao = "Precisa reduzir a velocidade";
        } else {
            acao = "Precisa acelerar";
        }
        return acao;
    }
}
