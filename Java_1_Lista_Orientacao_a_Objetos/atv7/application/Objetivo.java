package Java_1_Lista_Orientacao_a_Objetos.atv7.application;

import Java_1_Lista_Orientacao_a_Objetos.atv7.entities.Carro;

public class Objetivo {
    public static void main(String[] args) {

        Carro c1 = new Carro("Civic", "Honda");

        c1.acelerar();
        c1.acelerar();
        c1.frear();
        c1.frear();
        c1.frear();
    }
}

