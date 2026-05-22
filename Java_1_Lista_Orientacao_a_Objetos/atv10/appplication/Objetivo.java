package Java_1_Lista_Orientacao_a_Objetos.atv10.appplication;
import Java_1_Lista_Orientacao_a_Objetos.atv10.entities.termometro;

import java.util.Scanner;

public class Objetivo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite a temperatura em celsius: ");
            double temperatura = sc.nextDouble();
            termometro t1 = new termometro(temperatura);

            System.out.println("Temperatura em fahrenheit: " + t1.fahrenheit());
            System.out.println("Temperatura em kelvin: " + t1.kelvin());
            sc.close();
    }
}