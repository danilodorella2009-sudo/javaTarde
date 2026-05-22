package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("qual a quantidade de energia captada");
        int energia = sc.nextInt();
        String info = (energia < 200) ? "acionar energia auxiliar" : "energia solar suficiente";
        System.out.println("" + info);
        sc.close();
    }
}
