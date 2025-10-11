package Desafios_de_programação_logica;

import java.util.Locale;
import java.util.Scanner;

public class Desafio_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de termos: ");
        int n= sc.nextInt();
        long a=0, b=1;
        for (int i = 0; i < n; i++) {
            long atual;
            if (i==0) {
                atual=a;
            } else if (i==1) {
                atual= b;
            } else {
                atual = a+b;
                a=b;
                a=atual;
            }
            boolean primo= true;
            if (atual <2) {
                primo= false;
            } else {
                for (int j = 2; j <=atual / 2; j++) {
                    if (atual % j ==0) {
                        primo= false;
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println(atual + "* ");
            } else {
                System.out.println(atual + " ");
            }
            long proximo= a+b;
            a=b;
            b=proximo;
        }
        sc.close();
    }
}
