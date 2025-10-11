package Atv13_lista2;

import java.util.Scanner;

public class Atv11_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do sensor frontal (0 livre, 1 obstáculo):");
        int frontal = sc.nextInt();

        System.out.println("Digite o valor do sensor da direita (0 livre, 1 obstáculo):");
        int direita = sc.nextInt();

        System.out.println("Digite o valor do sensor da esquerda (0 livre, 1 obstáculo):");
        int esquerda = sc.nextInt();

        if (frontal == 0) {
            System.out.println("Seguir em frente");
        } else if (direita == 0) {
            System.out.println("Desviar para a direita");
        } else if (esquerda == 0) {
            System.out.println("Desviar para a esquerda");
        } else {
            System.out.println("Parar, nenhum caminho disponível");
        }
        sc.close();
    }
}
