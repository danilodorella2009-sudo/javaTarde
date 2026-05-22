package Java_1_Lista_Orientacao_a_Objetos.atv9.appplication;

import Java_1_Lista_Orientacao_a_Objetos.atv9.entities.Agenda;
import Java_1_Lista_Orientacao_a_Objetos.atv9.entities.Contato;

public class Objetivo {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        agenda1.contato[0] = new Contato("Gustavo", "99999-1111");
        agenda1.contato[1] = new Contato("Barbara", "99999-2222");
        agenda1.contato[2] = new Contato("Helena", "99999-3333");

        agenda1.listarContatos();

    }
}
