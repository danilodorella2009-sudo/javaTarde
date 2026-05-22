package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a situação do sensor frontal(0 livre/1 obstaculo):");
        int sensorF = sc.nextInt();

        System.out.println("digite a situaçâo do sensor da direita(0 livre/1 obstaculo):");
        int sensorD = sc.nextInt();

        System.out.println("digite a situação da esquerda(0 livre/1 obstaculo):");
        int sensorE = sc.nextInt();

        if (sensorF == 0) {
            System.out.println("seguir em frente");

        } else if (sensorD == 0) {
            System.out.println("desviar para a direita");

        } else if (sensorE == 0) {
            System.out.println("desviar para a esquerda");

        } else {
            System.out.println("parar");


        }
        sc.close();
    }
}
