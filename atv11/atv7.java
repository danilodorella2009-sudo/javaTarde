package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso dos pacotes");
        int peso = sc.nextInt();
        if (peso < 10) {
            System.out.println("Pacotes leves");
        } else if (peso <= 30) {
            System.out.println("pacotes medios");
        } else if (peso <= 60) {
            System.out.println("Pacotes pesados");
        } else {
            System.out.println("pacotes muito pesados");
        }
        sc.close();
    }
}
