package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variavel para armazenar o tempo de mistura em minutos
        int tempo;
        //Declara variavel para armazenar a confirmacao de encerramento
        String confirma;
        //Estrutura de repeticao que garante pelo menos 10 minutos de mistura
        do {
            //Solicita ao operador o tempo de mistura
            System.out.print("Informe o tempo de mistura (minutos): ");
            tempo = sc.nextInt();
            sc.nextLine(); //Consome o enter deixado pelo nextInt
            //Se o tempo for igual ou maior que 10, solicita confirmacao para encerrar
            if (tempo >= 10) {
                System.out.print("Tempo minimo atingido. Deseja encerrar? (S/N): ");
                confirma = sc.nextLine();
            } else {
                System.out.println("Tempo insuficiente! Deve misturar pelo menos 10 minutos.\n");
                confirma = "N";
            }
            //Repete enquanto a confirmacao nao for 'S' (sim)
        } while (!confirma.equalsIgnoreCase("S"));
        //Exibe mensagem final informando que a mistura foi encerrada
        System.out.println("Mistura encerrada aos " + tempo + " minutos");
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
