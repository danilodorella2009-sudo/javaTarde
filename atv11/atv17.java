package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("O robô A está funcionando ? ");
        String robo = sc.nextLine();

        if (robo.equalsIgnoreCase("sim")) {
            System.out.println("Continuar o trabalho");
        } else {
            System.out.println("O robô B esta funcionando ? ");
            robo = sc.nextLine();

            if (robo.equalsIgnoreCase("sim")) {
                System.out.println("Acionar o robô B ");
            } else {
                System.out.println("Parar a linha ");
            }
            sc.close();
        }
    }
}
