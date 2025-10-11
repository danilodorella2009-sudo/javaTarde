package Atv13_lista1;

import java.util.Locale;
import java.util.Scanner;

public class Atv8_13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nivel de energia captada?");
        int enrgia = sc.nextInt();
        String info = (enrgia < 200) ? "Acionar energia auxiliar" : "Energia solar suficiente";
        System.out.println("" + info);
        sc.close();

    }
}
