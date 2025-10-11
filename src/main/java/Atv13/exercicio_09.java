package Atv13;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de material disponivel");
        int material = sc.nextInt();
        ;
        String info = (material > 0) ? "impressao iniciada" : "Sem material disponivel";
        System.out.println("" + info);
        sc.close();
    }
}
