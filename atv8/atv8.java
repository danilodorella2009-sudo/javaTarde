package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o nivel de oleo");
        int oleo = sc.nextInt();
        String info = (oleo < 30) ? "Adicionar oleo" : "Nivel adequado";
        System.out.println("" + info);
        sc.close();
    }
}
