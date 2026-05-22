package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variavel para armazenar o resultado do teste
        boolean teste;
        //Declara variavel para contar o numero de tentativas
        int tentativas = 0;
        //Estrutura de repeticao que continua ate que o teste seja true
        do {
            //Solicita ao operador o resultado do teste (true/false)
            System.out.print("Informe o resultado do teste (true/false): ");
            //Le o valor digitado e converte para boolean
            teste = sc.nextBoolean();
            //Incrementa o contador de tentativas
            tentativas++;
            //Repete enquanto o teste for false
        } while (!teste);
        //Exibe o numero de tentativas realizadas
        System.out.println("Tentativas: " + tentativas);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
