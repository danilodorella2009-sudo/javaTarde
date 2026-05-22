package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto de salario voce recebe");
        double salario = sc.nextDouble();

        System.out.println(salario>3.000 ? "Salario alto" : "Salario baixo");
        sc.close();
    }
}
