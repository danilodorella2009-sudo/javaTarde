package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Solicita ao operador o takt time maximo
        System.out.print("Informe o takt time maximo: ");
        double takt = sc.nextDouble();
        //Declara variaveis para soma dos tempos e contador de estacoes
        double soma = 0;
        int estacoes = 0;
        //Declara variavel para armazenar o tempo da estacao atual
        double tempo;
        //Estrutura de repeticao que continua ate a media ficar menor ou igual ao takt
        do {
            //Solicita ao operador o tempo da estacao
            System.out.print("Informe o tempo da estacao: ");
            tempo = sc.nextDouble();

            //Adiciona o tempo ao total e incrementa o contador de estacoes
            soma += tempo;
            estacoes++;

            //Repete enquanto a media dos tempos for maior que takt
        } while ((soma / estacoes) > takt);
        //Calcula a media final
        double media = soma / estacoes;
        //Exibe a media e o numero de estacoes
        System.out.println("Media: " + media + " | Estacoes: " + estacoes);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
