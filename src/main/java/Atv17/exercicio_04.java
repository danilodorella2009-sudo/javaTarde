package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*O menu do painel MES refere-se ao menu de navegação dentro de
        um Sistema de Execução de Manufatura (MES).*/
        int opcao;

        do {
            System.out.println("Menu do painel MES ");
            System.out.println("1. Registrar parada ");
            System.out.println("2. Registrar produção ");
            System.out.println("3. Sair ");
            System.out.print("Escoha uma opção: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println("Parada registrada ");
            }
            else if (opcao == 2) {
                System.out.println("Produção registrada ");
            }
            else if (opcao == 3) {
                System.out.println("Encerrando menu ");
            }
            else {
                System.out.println("Opção inválida, tente novamente. ");
            }
        } while (opcao != 3);
        sc.close();
    }
}
