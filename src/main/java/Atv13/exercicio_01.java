package Atv13;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura (°C):");
        int temparatura = sc.nextInt();
        String info = (temparatura > 80) ? "maquina desligada" : "maquina operando normalmente";
        System.out.println("Valor temperatura" + info);
        sc.close();

        }
            
        }

