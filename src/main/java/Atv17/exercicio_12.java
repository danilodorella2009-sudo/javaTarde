package Atv17;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*WMS é a sigla para Warehouse Management System, que se traduz para Sistema de
        Gerenciamento de Armazém em português. Trata-se de um software para otimizar e automatizar
        as operações de um
        armazém, como recebimento, armazenamento,
        separação de pedidos (picking), embalagem e expedição.*/
        int numero;
        int contador = 0;

        System.out.println("Digite o número do palete (ou -1 para encerrar):");
        while (true) {
            numero = sc.nextInt();
            if (numero == -1) {
                break;
            }
            contador++;
        }
        System.out.println("Paletes conferidos: " + contador);
        sc.close();
    }
}
