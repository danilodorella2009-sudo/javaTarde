package atv15;

import java.util.Locale;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Clique a recla ENTER para começar o programa");
        sc.nextLine();

        int leitura = 1;
        int falhas = 0;
        int status;

        while (falhas<5){
            System.out.println("Leitura " + leitura + " - Sensor falhou (1) ou está OK (0)? ");
            status = sc.nextInt();

            if (status==1){
                falhas++;
                System.out.println("Falha detectada! Total de falhas consecutivas: " + falhas);
            }else{
                falhas=0;
                System.out.println("Sensor funcionando normalmente. ");
            }
            leitura++;
        }
        System.out.println(" 5 falhas consecutivas detectadas! Sistema desligado." );
        sc.close();
    }
}
