package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura (C°)");
        int tem = sc.nextInt();
        if (tem > 80) {

            System.out.println("Alerta:Maquina desligada por superaquecimento!");
        } else {
            System.out.println("Maquina operando normalmente");
        }
    }
}
