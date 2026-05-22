package Java_1_Lista_Orientacao_a_Objetos.atv9.entities;

public class Agenda {
    public Contato[] contato = new Contato[5];

    public void listarContatos() {
        for (int i = 0; i < contato.length; i++) {
            System.out.println(contato[i].nome);
        }
    }
}
