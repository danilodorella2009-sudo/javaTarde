package Java_1_Lista_Orientacao_a_Objetos.atv3.appplication;

import Java_1_Lista_Orientacao_a_Objetos.atv3.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da base");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura");
        double altura = sc.nextDouble();

        double resultado = base * altura;
        System.out.println("O valor da area é " + resultado);
        sc.close();
    }
}
