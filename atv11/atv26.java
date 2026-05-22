package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nível de energia do robô: ");
        int tinta = sc.nextInt();

        if (tinta < 15) {
            System.out.println("Parar");
        } else if (tinta <= 50) {
            System.out.println("Alerta");
        } else {
            System.out.println("Continuar");
        }
        sc.close();
    }
}
