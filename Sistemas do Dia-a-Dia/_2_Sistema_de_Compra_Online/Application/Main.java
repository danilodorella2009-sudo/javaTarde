package _2_Sistema_de_Compra_Online.Application;
import _2_Sistema_de_Compra_Online.Entities.compra;
public class Main {
    public static void main(String[] args) {
        compra compra = new compra();

        compra.adicionarProdutos();

        compra.dadosCliente();

        compra.calcularFrete();

        compra.finalizarCompra();
    }
}
