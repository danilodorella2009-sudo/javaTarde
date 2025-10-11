package Atv13_lista2;

import java.util.Scanner;

public class Atv11_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem de energia solar disponível (%):");
        int energiaSolar = sc.nextInt();

        if (energiaSolar > 70) {
            System.out.println("Usar energia solar");
        } else if (energiaSolar >= 30) {
            System.out.println("Usar modo híbrido");
        } else {
            System.out.println("Usar rede elétrica");
        }
        sc.close();
    }
}
