package Java_1_Lista_Orientacao_a_Objetos.atv5.entities;

public class ContaBancaria {
    public String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositado: R$ " + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo = valor;
            System.out.println("Saque de R$ " + valor + "realizado");
        } else {
            System.out.println("Saldo insuficiente para sacar R$ " + valor);
        }
    }
    public void exibirSaldo(){
        System.out.println("Titular: " +titular+" Saldo atual: R$ " +saldo);
    }
}

