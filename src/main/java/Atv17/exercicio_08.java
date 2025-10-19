package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //AGV é a sigla para Automated Guided Vehicle, que significa "Veículo Guiado Automaticamente"
        int caixas, soma = 0, viagens = 0;

        do {
            System.out.println("Digite a quantidade de caixas entregues nesta viagem: ");
            caixas = sc.nextInt();
            soma += caixas;
            viagens++;
        } while (soma < 50);
        System.out.println("Total de caixas entregues: " + soma);
        System.out.println("Total de viagens realizadas: " + viagens);
        sc.close();
    }
}
