package Atv13_lista2;

import java.util.Scanner;

public class Atv11_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura da máquina (°C):");
        double temperatura = sc.nextDouble();

        System.out.println("Digite o nível de vibração da máquina (%):");
        double vibracao = sc.nextDouble();

        if (temperatura > 90 || vibracao > 80) {
            System.out.println("Desligar máquina em emergência");
        } else {
            System.out.println("Máquina funcionando normalmente");
        }
        sc.close();
    }
}
