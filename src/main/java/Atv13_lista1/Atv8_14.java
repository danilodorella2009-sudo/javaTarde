package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o número de peças montadas?");
        int peca = sc.nextInt();
        String info = (peca == 0) ? "Erro: verfificar robô" : "Montagem em andamento";
        System.out.println("" + info);
        sc.close();
    }
}
