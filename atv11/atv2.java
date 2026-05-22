package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o codigo da peça(1-4)");
        int codigo = sc.nextInt();

        if (codigo == 1) {
            System.out.println("peça aprovado");
        } else if (codigo == 2) {
            System.out.println("peça reprovada");
        } else if (codigo == 3) {
            System.out.println("peça retrabalhada");
        } else if (codigo == 4) {
            System.out.println("peça e, analise manual");
        } else {
            System.out.println("codigo invalido");
        }
        sc.close();

    }
}
