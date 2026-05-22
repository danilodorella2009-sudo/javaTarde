package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tipo de defeito (visivel / microscopico / ausente): ");
        String defeitos = sc.nextLine();

        if (defeitos.equalsIgnoreCase("visivel")) {
            System.out.println("Nível de defeito: ALTO");
        } else if (defeitos.equalsIgnoreCase("microscopico")) {
            System.out.println("Nível de defeito: MEDIO");
        } else if (defeitos.equalsIgnoreCase("ausente")) {
            System.out.println("Nível de defeito: BAIXO");
        } else {
            System.out.println("Tipo de defeito inválido.");
        }
        sc.close();
    }
}
