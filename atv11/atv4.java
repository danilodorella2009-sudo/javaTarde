package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de usuario(1 operador, 2 supervisor, 3 engenheiro");
        int usuario = sc.nextInt();
        if (usuario == 1) {
            System.out.println("acesso restrito");
        } else if (usuario == 2) {
            System.out.println("Acesso parcial");
        } else if (usuario == 3) {
            System.out.println("Acesso local");
        } else {
            System.out.println("Usuario invalido");
        }
        sc.close();
    }
}
