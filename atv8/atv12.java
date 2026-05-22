package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a porcentagem da eficiencia");
        int eficiencia = sc.nextInt();
        String info = (eficiencia >= 85) ? "Eficiencia aceitavel" : "Manutenção recomendada";
        System.out.println("" + info);
        sc.close();
    }
}
