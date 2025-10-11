package Atv13;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o nivel do oleo");
        int oleo = sc.nextInt();
        String info = (oleo < 30) ? "Adicionar oleo" : "Nivel adequado";
        System.out.println("" + info);
        sc.close();
    }
}
