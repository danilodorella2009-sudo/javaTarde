package Atv16_lista_FOR;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite ENTER para começar o programa");
        int r = random.nextInt(60);
        int conta = 0;
        int contaa = 0;
        for (int s = 1; s <= 60; s++) {
            System.out.println(s + "° soldagem tempo " + r + " minutos");
            r = random.nextInt(60);
            conta = r + conta;
            contaa = conta / 60;
        }
        System.out.println("média " + contaa + " minutos");
        sc.close();
    }

}

