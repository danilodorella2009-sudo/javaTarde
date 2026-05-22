package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o pH ? ");
        int pH = sc.nextInt();

        if (pH < 7) {
            System.out.println("Ácido");
        } else if (pH == 7) {
            System.out.println("Neutro");
        } else {
            System.out.println("Básico");
        }
        sc.close();
    }
}
