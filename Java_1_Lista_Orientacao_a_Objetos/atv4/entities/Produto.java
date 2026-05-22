package Java_1_Lista_Orientacao_a_Objetos.atv4.entities;

public class Produto {
    public String nome;
    public double preco;
    public double quantidadeEstoque;

    public Produto(String nome, double peco, double quantidadeEstoque) {
        this.nome = nome;
        this.preco = peco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibrResumo() {
        double valorTotal= preco*quantidadeEstoque;
        System.out.println("Produto: " +nome);
        System.out.println("Preço: R$ " +preco);
        System.out.println("Quantidade: " +quantidadeEstoque);
        System.out.println("Valor total em estoque: R$ " +valorTotal);
    }
}
