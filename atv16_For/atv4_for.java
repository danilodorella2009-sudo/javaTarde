package atv16_For;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class atv4_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random random = new Random();
        System.out.println("Aperte ENTER para começar o programa");
        sc.nextLine();
        boolean defeito;
        double soma, porcentagem;
        soma = 0;
        for (int peca = 0; peca < 200; peca++) {
            System.out.println("A peça: " + peca + "foi verificada com sucesso");
            defeito = random.nextBoolean();
            if (defeito) {
                soma++;
            }
            porcentagem = (soma * 100) / 200;
            System.out.println("A quantidade de deifeito é: " + porcentagem + "%");
        }
        sc.close();
    }
}
