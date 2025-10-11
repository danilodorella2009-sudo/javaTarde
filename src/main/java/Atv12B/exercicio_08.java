package Atv12B;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int x= sc.nextInt();
        System.out.println("Digite o segundo numero");
        int y= sc.nextInt();
        int cal= x/y;
        int resto= x%y;
        System.out.println("Resultado da divisao:" +cal);
        System.out.println("Resto da divisão:" +resto);
        sc.close();
    }
}
