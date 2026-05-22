package atv19;

import java.util.Locale;
import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(" Digite qual numero gostaria de encontrar no vetor");
        int  n = sc.nextInt();
        boolean verifc = false;
        for (int i = 0; i < 10; i++){
            if (n == numeros[i]){
                verifc = true;
                break;
            }
        }
        if (verifc == true) {
            System.out.println("Numero encontrado");
        }else{
            System.out.println("Numero nao encontrado");
            sc.close();
        }
    }
}
