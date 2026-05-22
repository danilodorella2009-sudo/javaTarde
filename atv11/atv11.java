package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nivel do drone");
        int bate = sc.nextInt();
        if (bate < 20) {
            System.out.println("retorno imediato");
        } else if (bate <= 60) {
            System.out.println("rota curta");
        } else {
            System.out.println("rota longa");
        }
        sc.close();
    }
}
