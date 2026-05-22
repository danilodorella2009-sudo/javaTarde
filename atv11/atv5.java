package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as horas de uso da maquina");
        int urgencia = sc.nextInt();
        if (urgencia < 500) {
            System.out.println("urgencia baixa");
        } else if (urgencia < 1000) {
            System.out.println("urgencia media");

        } else {
            System.out.println("urgencia alta");
        }
        sc.close();

    }
}
