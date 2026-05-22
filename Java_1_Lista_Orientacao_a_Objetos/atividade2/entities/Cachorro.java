package Java_1_Lista_Orientacao_a_Objetos.atividade2.entities;

public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome=nome;
        this.raca=raca;
        this.idade=idade;
    }
    public void latir(){
        System.out.println("O"+ this.nome+"de raça"+this.raca+"está latindo; AUAUAUAUAUAU!!");
    }
}
