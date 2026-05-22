package Java_1_Lista_Orientacao_a_Objetos.atividade1.appplication;

import Java_1_Lista_Orientacao_a_Objetos.atividade1.entities.Lampada;

public class Objetivo {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();
        if (lampada.isLgada()) {
            System.out.println("A lampada está acesa");
        } else {
            System.out.println("A lampada está apagada");
        }
        lampada.desligar();
        if (lampada.isLgada()) {
            System.out.println("A lampada esta desligada");
        } else {
            System.out.println("A lampda está deligada");
        }
    }
}
