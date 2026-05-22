package Exemplos;

import java.util.Locale;
import java.util.Scanner;

import static Exemplos.exemploFuncao.showResult;

public class exemploFuncao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        funcClass func = new funcClass();
        System.out.println("Enter three numbers: ");
        func.a = sc.nextInt();
        func.b = sc.nextInt();
        func.c = sc.nextInt();

        System.out.println("O número maior é: " +func.max());
    }
}
