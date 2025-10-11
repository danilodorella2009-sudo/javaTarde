package Atv13_lista2;

import java.util.Scanner;

public class Atv11_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o percentual de tráfego suspeito (%):");
        int trafego = sc.nextInt();

        if (trafego > 70) {
            System.out.println("Bloquear acesso");
        } else if (trafego >= 30) {
            System.out.println("Alerta");
        } else {
            System.out.println("Tráfego normal");
        }
        sc.close();
    }
}
