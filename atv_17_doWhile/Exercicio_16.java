package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara variaveis para contar aprovadas e reprovadas
        int a = 0;
        int r = 0;
        //Estrutura de repeticao para ler 10 amostras
        for (int i = 1; i <= 10; i++) {
            String resultado;
            //Usa do-while para garantir entrada valida
            do {
                //Solicita ao operador o resultado da amostra
                System.out.print("Informe o resultado da amostra " + i + " (A=aprovada, R=reprovada): ");
                resultado = sc.nextLine();
                //Verifica se a entrada e invalida
                if (!resultado.equalsIgnoreCase("A") && !resultado.equalsIgnoreCase("R")) {
                    System.out.println("Entrada invalida! Digite A ou R.\n");
                }
            } while (!resultado.equalsIgnoreCase("A") && !resultado.equalsIgnoreCase("R"));
            //Atualiza os contadores
            if (resultado.equalsIgnoreCase("A")) {
                a++;
            } else {
                r++;
            }
        }
        //Exibe o total de aprovadas e reprovadas
        System.out.println("A: " + a + " | R: " + r);
        //Fecha o Scanner para liberar recursos
        sc.close();

    }
}
