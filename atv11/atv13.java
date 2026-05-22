package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a produção de peças por hora: ");
        int peca = sc.nextInt();

        if (peca < 50) {
            System.out.println("Baixo desempenho");
        } else if (peca <= 100) {
            System.out.println("Regular");
        } else {
            System.out.println("Ótimo");
        }
        sc.close();
    }
}
