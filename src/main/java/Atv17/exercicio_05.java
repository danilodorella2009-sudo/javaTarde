package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int peso, soma = 0, contador = 0;

        do {
            System.out.println("Digite o pesod da peça: ");
            peso = sc.nextInt();
            soma += peso;
            contador = contador + 1;
        }while (soma<500);
        System.out.println("Peças: "+contador+ " Peso total: "+soma+ " g");
        sc.close();
    }
}
