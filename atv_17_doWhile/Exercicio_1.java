package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler valores digitados pelo usuário
        Scanner sc = new Scanner(System.in);
        //Declara a variável que vai armazenar a temperatura lida
        int temperatura;
        //Estrutura de repetição "do...while" — executa pelo menos uma vez
        do {
            //Solicita ao usuário que informe a temperatura
            System.out.print("Informe a temperatura (em °C): ");

            //Lê o valor digitado e armazena na variável temperatura
            temperatura = sc.nextInt();

            //Verifica se a temperatura está fora do intervalo permitido
            if (temperatura < 800 || temperatura > 1200) {
                System.out.println("Temperatura fora do intervalo! Tente novamente.\n");
            }
            //Repete enquanto a temperatura for menor que 800 ou maior que 1200
        } while (temperatura < 800 || temperatura > 1200);
        //Quando a temperatura estiver no intervalo válido, exibe a mensagem final
        System.out.println("Temperatura válida: " + temperatura);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
