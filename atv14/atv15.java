package atv14;

import java.util.Locale;
import java.util.Scanner;

public class atv15 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        System.out.println(idade >= 16 ? "Pode votar" : "Não pode votar");
        sc.close();
    }
}
