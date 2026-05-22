package Inteligente_Controle.Entities;

public class produto {
    private String nome;
    private double preco;
    private int quantEstoque;

    public produto (String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }
    public double valorTotalEstoque() {
        return preco * quantEstoque;
    }
    public void adicionarProduto (int quant) {
        quantEstoque += quant;
    }
    public void removerProduto (int quant) {
        quantEstoque -= quant;
    }
    public String toString() {
        return "produto{" + "nome = " + nome + ", preço = " + preco + ", quantEstoque = " + quantEstoque + '}';
    }
}
