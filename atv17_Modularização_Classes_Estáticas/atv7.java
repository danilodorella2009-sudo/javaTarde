package atv17_Modularização_Classes_Estáticas;

import java.util.Locale;
import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso dos pacotes");
        int peso = sc.nextInt();
        String resultado = max(peso);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int peso) {
        String acao;
        if (peso < 10) {
            acao = "Pacotes leves";
        } else if (peso <= 30) {
            acao = "Pacotes medios";
        } else if (peso <= 60) {
            acao = "Pacotes pesados";
        } else {
            acao = "Pacotes muitos pesados";
        }
        return acao;
    }
}
