package atv_17_doWhile;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        //Cria o objeto Scanner para ler os dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);
        //Declara a variavel para armazenar o codigo RFID lido
        String codigo;
        //Estrutura de repeticao que continua ate receber um codigo com 8 caracteres
        do {
            //Solicita ao usuario que informe o codigo RFID
            System.out.print("Informe o codigo RFID: ");
            //Le a entrada do usuario
            codigo = sc.nextLine();
            //Verifica se o tamanho do codigo e diferente de 8
            if (codigo.length() != 8) {
                System.out.println("Codigo invalido! Deve conter exatamente 8 caracteres.\n");
            }
            //Repete enquanto o tamanho do codigo for diferente de 8
        } while (codigo.length() != 8);
        //Exibe mensagem final apos validar o codigo
        System.out.println("Codigo aceito");
        //Fecha o Scanner para liberar recursos
        sc.close();
    }
}
