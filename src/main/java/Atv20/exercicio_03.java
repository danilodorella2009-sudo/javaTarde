package Atv20;


import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        System.out.println("Quantos preços deseja informar? ");
        int n=sc.nextInt();

        double[] precos= new double[n];

        for (int i=0; i<n;i++) {
            System.out.println("Preços " + (i+1) + ":");
            precos[i]= sc.nextDouble();
        }
        double soma=0;
        System.out.println("Preço digitados");
        for (double p: precos) {
            System.out.println(p);
            soma+=p;
        }
        double media= soma/n;
        System.out.println("Média dos preços é: " +media);

    }
}
