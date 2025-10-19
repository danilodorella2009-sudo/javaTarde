package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int energia, soma = 0, turnos = 0;
        double media;

        do {
            System.out.println("Digite o consumo de energia (0 para encerrar): ");
            energia = sc.nextInt();
            if (energia != 0) {
                soma += energia;
                turnos++;
            }
        } while (energia != 0);
        if (turnos > 0) {
            media = soma / turnos;
            System.out.println("Total: " + soma + " Média:" + media);
        } else {
            System.out.println("Nenhum turno registrado. ");
        }
        sc.close();
    }
}
