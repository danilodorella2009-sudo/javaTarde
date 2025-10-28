package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem de energia solar disponível (%):");
        int energiaSolar = sc.nextInt();
        String resultado = max(energiaSolar);
        System.out.println(resultado);
        sc.close();
    }

    public static String max(int energiaSolar) {
        String acao;

        if (energiaSolar > 70) {
            acao = "Usar energia solar";
        } else if (energiaSolar >= 30) {
            acao = "Usar modo híbrido";
        } else {
            acao = "Usar rede elétrica";
        }
        return acao;
    }
}
