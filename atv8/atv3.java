package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a porcentagem da energia do robo?");
        int robo = sc.nextInt();
        String info = (robo <= 50) ? "robo iniciando pintura" : "energia insuficente";
        System.out.println("" + info);
        sc.close();


    }
}
