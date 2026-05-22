package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv19 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Horas trabalhadas");
        double horas = sc.nextDouble();

        System.out.println("Valor por hora");
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;
        String resultado = (salario > 2000) ? " Salario bom" : "Salario ruim";

        System.out.println(resultado);
        sc.close();
    }
}
