package Java_1_Lista_Orientacao_a_Objetos.atv6.application;

import Java_1_Lista_Orientacao_a_Objetos.atv6.entities.Aluno;

public class Objetivo {
    public static void main(String[] args) {

        double[] notasGustavo = {8.5, 7, 9};

        Aluno aluno1 = new Aluno("Barbara", 2024001, notasGustavo);

        aluno1.exibirRelatorio();
    }
}
