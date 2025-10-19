package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //RFID é a sigla para Identificação por Radiofrequência.
        String codigo;
        do {
            System.out.println("Digite seu código: ");
            codigo = sc.nextLine();
            if (codigo.length()!=8) {
                System.out.println("Código inválido. ");
                System.out.println("Digite novamente: ");
                codigo = sc.nextLine();
            }
        } while (codigo.length()!=8);
        System.out.println("Código aceito");
    }
}
