package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para armazenar o numero do palete e a contagem de paletes
        int palete;
        int contagem = 0;
        //Estrutura de repeticao que continua ate o operador digitar -1
        do {
            //Solicita ao operador que informe o numero do palete
            System.out.print("Informe o numero do palete (-1 para encerrar): ");
            palete = sc.nextInt();
            //Verifica se o valor digitado e diferente de -1 para incrementar a contagem
            if (palete != -1) {
                contagem++;
            }
            //Repete enquanto o numero do palete for diferente de -1
        } while (palete != -1);
        //Exibe a contagem final de paletes conferidos
        System.out.println("Paletes conferidos: " + contagem);
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
