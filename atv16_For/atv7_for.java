package atv16_For;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class atv7_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println(" Aperte a tecla ENTER para começar o programa");
        sc.nextLine();
        int conta = 0, resultado = 0;
        for (int i = 1; i <= 60; i++) {
            System.out.println(i + " soldagem tempo " + i + " minutos: ");
            i = rand.nextInt();
            conta = i + conta;
            resultado = conta / 60;
            System.out.println("Media " + resultado +" minutos");
            sc.close();
        }
    }
}
