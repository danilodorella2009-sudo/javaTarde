package Sistema_de_Controle_Online.application;

import Sistema_de_Controle_Online.entities.compra;

public class main {

    public static void main(String[] args) {

        compra compra = new compra();

        compra.adicionarProdutos();

        compra.dadosCliente();

        compra.calcularFrete();

        compra.finalizarCompra();

        System.out.println("Resumo da Compra ");

        System.out.println("Nome: " + compra.getNome());
        System.out.println("CPF: " + compra.getCpf());
        System.out.println("Endereço: " + compra.getEndereco());
        System.out.println("Pagamento: " + compra.getPagamento());

        System.out.println("Frete: R$ " + compra.getFrete());
        System.out.println("Total: R$ " + compra.getTotal());
    }
}