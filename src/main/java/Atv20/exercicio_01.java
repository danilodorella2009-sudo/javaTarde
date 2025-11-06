package Atv20;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] vect = new String[]{"Ana", "Bia", "Gustavo"};
        for (String obj: vect) {
            System.out.println(obj);
        }
    }
}
