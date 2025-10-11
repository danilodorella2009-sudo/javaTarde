package Atv13_lista2;

import java.util.Scanner;

public class Atv11_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crachá válido? (true/false):");
        boolean cracha = sc.nextBoolean();

        System.out.println("Capacete de segurança? (true/false):");
        boolean capacete = sc.nextBoolean();

        System.out.println("Dentro do horário de turno? (true/false):");
        boolean horario = sc.nextBoolean();

        if (cracha && capacete && horario) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
