package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        String info = (idade>=18) ? "Maior de idade" : "Menor de idade";
        System.out.println(""+info);
        sc.close();
    }
}
