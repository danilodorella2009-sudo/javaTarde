package Java_1_Lista_Orientacao_a_Objetos.atv5.appplication;

import Java_1_Lista_Orientacao_a_Objetos.atv5.entities.ContaBancaria;

public class Objetivo {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Gustavo", 100);

        minhaConta.exibirSaldo();

        minhaConta.depositar(50);

        minhaConta.sacar(70);

        minhaConta.sacar(200);

        minhaConta.exibirSaldo();
    }
}
