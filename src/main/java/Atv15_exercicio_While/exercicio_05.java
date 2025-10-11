package Atv15_exercicio_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pressao = 0;
        while (pressao < 120) {
            pressao += Math.random() * 10;
            System.out.println("Pressão atual: " + String.format("%.2f", pressao) + " psi");
        }
        System.out.println("Alerta! Limite de pressão atingida: " + String.format("%.2f", pressao) + " psi");
        sc.close();
    }
}
