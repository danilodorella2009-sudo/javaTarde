package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para contar aprovadas e reprovadas
        int aprovadas = 0;
        int reprovadas = 0;
        //Declara a variavel para armazenar a entrada do operador
        String resultado;
        //Estrutura de repeticao que continua ate o operador digitar "FIM"
        do {
            //Solicita ao operador que informe o resultado da amostra
            System.out.print("Informe o resultado (A=aprovada, R=reprovada, FIM=encerra): ");
            //Le a entrada do usuario
            resultado = sc.nextLine();
            //Verifica o valor informado e atualiza os contadores
            if (resultado.equalsIgnoreCase("A")) {
                aprovadas++;
            } else if (resultado.equalsIgnoreCase("R")) {
                reprovadas++;
            } else if (!resultado.equalsIgnoreCase("FIM")) {
                System.out.println("Entrada invalida! Digite A, R ou FIM.\n");
            }
            //Repete enquanto a entrada for diferente de "FIM"
        } while (!resultado.equalsIgnoreCase("FIM"));
        //Exibe o total de aprovadas e reprovadas
        System.out.println("Aprovadas: " + aprovadas + " | Reprovadas: " + reprovadas);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
