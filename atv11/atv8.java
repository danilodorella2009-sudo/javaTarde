package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade restante de material");
        int material = sc.nextInt();
        String info = (material < 20) ? "Troca de material " + material + "%" : "Continuar impressão " + material + "%";
        System.out.println("" + info);
        sc.close();
    }
}
