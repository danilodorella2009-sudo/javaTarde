package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler as opcoes digitadas pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara a variavel para armazenar a opcao escolhida
        int opcao;
        //Estrutura de repeticao que exibe o menu pelo menos uma vez
        do {
            //Exibe o menu de opcoes
            System.out.println("Menu do Painel MES:");
            System.out.println("1. Registrar parada");
            System.out.println("2. Registrar producao");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            //Le a opcao digitada pelo usuario
            opcao = sc.nextInt();
            //Verifica qual opcao foi escolhida e executa a acao correspondente
            switch (opcao) {
                case 1:
                    System.out.println("Parada registrada\n");
                    break;
                case 2:
                    System.out.println("Producao registrada\n");
                    break;
                case 3:
                    System.out.println("Encerrando menu");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.\n");
            }
            //Repete enquanto a opcao for diferente de 3 (Sair)
        } while (opcao != 3);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
