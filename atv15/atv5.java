package atv15;

import java.util.Locale;
import java.util.Scanner;

public class atv5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pressao = 0;

        while (pressao < 120) {
            pressao++;
            System.out.println("A pressao atingida foi " + pressao);
        }
        sc.close();
    }
}
