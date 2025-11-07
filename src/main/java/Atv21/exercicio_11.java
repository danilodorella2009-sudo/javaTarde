package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> temps = new ArrayList<>();
        System.out.println("Digite as 7 temperaturas:");
        for (int i = 0; i < 7; i++) {
            temps.add(sc.nextDouble());
        }
        System.out.println("\n--- Temperaturas da semana ---");
        for (double t : temps) {
            if (t >= 35)
                System.out.println(t + " °C  -> Alerta de calor!");
            else{
                System.out.println(t + " °C");
            }
        }
    }
}