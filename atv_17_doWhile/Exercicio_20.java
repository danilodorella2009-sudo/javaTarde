package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Solicita ao operador o numero total de prateleiras a validar
        System.out.print("Informe o numero total de prateleiras: ");
        int totalPrateleiras = sc.nextInt();
        //Declara variavel para contar prateleiras validadas
        int prateleirasValidadas = 0;
        //Estrutura de repeticao que continua ate validar todas as prateleiras
        while (prateleirasValidadas < totalPrateleiras) {
            //Solicita ao operador a validacao da prateleira
            System.out.print("Digite 1 para validar a prateleira: ");
            int valida = sc.nextInt();
            //Se o operador digitou 1, incrementa o contador
            if (valida == 1) {
                prateleirasValidadas++;
            } else {
                System.out.println("Entrada invalida! Digite 1 para validar.\n");
            }
        }
        //Exibe mensagem informando que o inventario foi concluido
        System.out.println("Inventario concluido");
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
