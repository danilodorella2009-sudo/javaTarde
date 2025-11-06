package Atv21;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas tarefas separadas por vírgula: ");
        String linha = sc.nextLine();

        String[] tarefasSeparadas = linha.split(",");

        ArrayList<String> tarefas = new ArrayList<>();


        for (String t : tarefasSeparadas) {
            t = t.trim();
            if (!t.isEmpty()) {
                tarefas.add(t);
            }
        }


        System.out.println("Checklist de estudos: ");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        sc.close();
    }
}

