package desafioProgramaçao;

import java.util.Locale;
import java.util.Scanner;

public class desafio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int minimo = 1;
        int maximo = 100;
        int numeroSecreto = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        int tentativas = 0;
        int minAtual = minimo;
        int maxAtual = maximo;
        boolean venceu = false;
        System.out.println("Tente adivinhar o número entre " + minimo + " e " + maximo);
        while (!venceu) {
            System.out.print("Seu palpite: ");
            int palpite = sc.nextInt();
            tentativas++;
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                venceu = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("É maior.");
                if (palpite >= minAtual) {
                    minAtual = palpite + 1;
                }
            } else {
                System.out.println("É menor.");
                if (palpite <= maxAtual) {
                    maxAtual = palpite - 1;
                }
            }
        }
        int intervalo = maximo - minimo + 1;
        int maxTentativasBuscaBinaria = (int) Math.ceil(Math.log(intervalo) / Math.log(2));

        System.out.println("\nAvaliação da sua estratégia:");

        if (tentativas <= maxTentativasBuscaBinaria) {
            System.out.println("Muito bom! Sua estratégia foi eficiente, próxima da busca binária.");
        } else {
            System.out.println("Sua estratégia foi ineficiente, tente adivinhar escolhendo o meio do intervalo a cada vez.");
            System.out.println("Número máximo ideal de tentativas (busca binária): " + maxTentativasBuscaBinaria);
        }
        sc.close();
    }
}


