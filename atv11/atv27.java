package atv11;

import java.util.Locale;
import java.util.Scanner;

public class atv27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo de erro (crítico, moderado, nenhum): ");
        String erro = sc.nextLine();

        if (erro.equalsIgnoreCase("critico")) {
            System.out.println("Parar linha");
        } else if (erro.equalsIgnoreCase("moderado")) {
            System.out.println("Acionar manutenção");
        } else if (erro.equalsIgnoreCase("Nenhum")) {
            System.out.println("Continuar produção");
        } else {
            System.out.println("Entrada inválida");
        }
        sc.close();
    }
}
