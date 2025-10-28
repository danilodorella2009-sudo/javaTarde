package Atv17_modularizacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a situação do sensor frontal (livre/obstaculo): ");
        String sensorF = sc.nextLine();
        System.out.println("Digite a situação do sensor da direita (livre/obstaculo): ");
        String sensorD = sc.nextLine();
        System.out.println("Digite a situação do sensor da esquerda (livre/obstaculo): ");
        String sensorE = sc.nextLine();
        String resultado = max(sensorF, sensorD, sensorE);
        System.out.println("Ação do robô: " + resultado);

        sc.close();
    }

    public static String max(String sensorF, String sensorD, String sensorE) {
        String acao;

        if (sensorF.equalsIgnoreCase("Livre") &&
                sensorD.equalsIgnoreCase("livre") &&
                sensorE.equalsIgnoreCase("Livre")) {
            acao = "Segur em frente";
        } else if (sensorF.equalsIgnoreCase("obstaculo") &&
                sensorD.equalsIgnoreCase("livre")) {
            acao = "Desviar para a direita";
        } else if (sensorF.equalsIgnoreCase("obstaculo") &&
                sensorE.equalsIgnoreCase("livre")) {
            acao = "Desviar para a esquerda";
        } else if (sensorF.equalsIgnoreCase("obstaculo") &&
                sensorD.equalsIgnoreCase("obstaculo") &&
                sensorE.equalsIgnoreCase("obstaculo")) {
            acao = "Parar";
        } else {
            acao = "Ação indefinida";
        }
        return acao;
    }
}
