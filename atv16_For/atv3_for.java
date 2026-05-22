package atv16_For;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class atv3_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Aperte ENTER para começar o programa");
        sc.nextLine();
        Random rand = new Random();
        double soma = 0;
        double media;
        for (int dia = 1; dia <31; dia++){
            int prod = rand.nextInt(400);
            System.out.println("O dia atual é: " + dia + " sua produção foi de: " + prod);
            soma +=prod;
        }
        System.out.println("O total da produção foi de: " + soma);
        media = soma/31;
        System.out.printf("A media é: %.2f%n" , media);
        sc.close();
            }
        }




