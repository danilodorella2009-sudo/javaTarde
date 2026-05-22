package atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas tarefas separadas por vírgula: ");
        String linha = sc.nextLine();
        ArrayList<String> tarefas = new ArrayList<>();
        String[] partes = linha.split(",");
        for (String t : partes) {
            t = t.trim();
            if (!t.isEmpty()){
                tarefas.add(t);
            }
        }
        System.out.println("Sua lista de tarefas é: ");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1)+ ") "+ tarefas.get(i));
        }
        sc.close();
    }
}
