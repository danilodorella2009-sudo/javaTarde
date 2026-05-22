package atv8;

import java.util.Locale;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o peso da peça");
        int peca = sc.nextInt();
        String peso = (peca >= 5) ? "peça pesada" : "peça leve";
        System.out.println("" + peso);
        sc.close();
    }
}
