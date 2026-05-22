package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de peças montadas");
        int peca = sc.nextInt();
        String info = (peca== 0) ? "Erro:Verificar robo" : "Montagem em andamento";
        System.out.println("" + info);
        sc.close();
    }
}
