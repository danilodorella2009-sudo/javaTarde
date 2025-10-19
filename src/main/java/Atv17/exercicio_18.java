package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double takt, tempo, somaTempos = 0, media = 0;
        int contador = 0;

        System.out.print("Informe o Takt time: ");
        takt = sc.nextDouble();
        System.out.println("Digite os tempos das estações (digite 0 ou negativo para parar):");
        tempo = sc.nextDouble();
        while (tempo > 0) {
            somaTempos += tempo;
            contador++;
            media = somaTempos / contador;
            tempo = sc.nextDouble();
        }
        if (contador > 0) {
            System.out.println("Média: " + media + " | Estações: " + contador);
        } else {
            System.out.println("Nenhuma estação registrada.");
        }
        sc.close();
    }
}
