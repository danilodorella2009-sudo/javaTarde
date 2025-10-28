package Atv18;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Classificador de Idade");
        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        String classificacao = ClassificadorIdade.classificar(idade);
        System.out.println("Classificação: " + classificacao);
        sc.close();
    }

    class ClassificadorIdade {
        public static String classificar(int idade) {
            if (idade < 0) {
                return "Idade inválida!";
            } else if (idade <= 12) {
                return "Infantil";
            } else if (idade <= 17) {
                return "Adolescente";
            } else if (idade <= 59) {
                return "Adulto";
            } else {
                return "Idoso";
            }
        }
    }
}

