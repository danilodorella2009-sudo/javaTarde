package Atv13_lista2;

import java.util.Scanner;

public class Atv11_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de erro (critico, moderado, nenhum):");
        String erro = sc.next();

        if (erro.equalsIgnoreCase("critico")) {
            System.out.println("Parar linha de produção");
        } else if (erro.equalsIgnoreCase("moderado")) {
            System.out.println("Acionar manutenção");
        } else if (erro.equalsIgnoreCase("nenhum")) {
            System.out.println("Continuar produção");
        } else {
            System.out.println("Tipo de erro inválido");
        }
        sc.close();
    }
}

