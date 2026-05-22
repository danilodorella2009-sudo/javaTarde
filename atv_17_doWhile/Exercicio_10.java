package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para armazenar ciclos e paradas
        int ciclos;
        int paradas;
        //Estrutura de repeticao para validar entradas
        do {
            //Solicita ao operador o numero de ciclos validos (>0)
            System.out.print("Informe o numero de ciclos validos (>0): ");
            ciclos = sc.nextInt();
            if (ciclos <= 0) {
                System.out.println("Valor invalido! Os ciclos devem ser maiores que 0.\n");
            }
        } while (ciclos <= 0);

        do {
            //Solicita ao operador o numero de paradas (>=0)
            System.out.print("Informe o numero de paradas (>=0): ");
            paradas = sc.nextInt();
            if (paradas < 0) {
                System.out.println("Valor invalido! As paradas devem ser iguais ou maiores que 0.\n");
            }
        } while (paradas < 0);
        //Calcula a taxa de disponibilidade
        double disponibilidade = (double) ciclos / (ciclos + paradas);
        //Exibe a disponibilidade com duas casas decimais
        System.out.printf("Disponibilidade: %.2f%n", disponibilidade);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
