package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura do data center: ");
        int temperatura = sc.nextInt();

        if (temperatura > 80) {
            System.out.println("Desligar serviodres");
        } else if (temperatura >= 60) {
            System.out.println("Resfriamneto extra");
        } else {
            System.out.println("Normal");
        }
        sc.close();
    }
}
