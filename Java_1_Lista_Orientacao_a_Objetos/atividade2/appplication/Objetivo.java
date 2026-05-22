package Java_1_Lista_Orientacao_a_Objetos.atividade2.appplication;

import Java_1_Lista_Orientacao_a_Objetos.atividade2.entities.Cachorro;

public class Objetivo {
    public static void main(String[] args) {

        Cachorro meuCachorro1 = new Cachorro(" negão ", " rottweuiler ", 5);
        Cachorro meuCachorro2 = new Cachorro(" paçoca ", " caramelo ", 3);

        meuCachorro1.latir();
        meuCachorro2.latir();
    }
}
