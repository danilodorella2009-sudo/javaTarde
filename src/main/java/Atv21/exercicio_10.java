package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Digite os e-mails separados por vírgula:");
        String[] partes = sc.nextLine().split(",");
        for (String e : partes) {
            String email = e.trim().toLowerCase();
            if (!lista.contains(email)) {
                lista.add(email);
            } else {
                System.out.println("Duplicado ignorado: " + email);
            }
        }
        System.out.println("E-mails normalizados e únicos");
        for (String e : lista)
            System.out.println(e);
    }
}
