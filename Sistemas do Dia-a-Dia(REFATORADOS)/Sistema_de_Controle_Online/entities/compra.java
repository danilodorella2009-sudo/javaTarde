package Sistema_de_Controle_Online.entities;

import java.util.Scanner;

public class compra {

    private String nome;
    private String cpf;
    private String endereco;
    private String pagamento;

    private double total = 0;
    private double frete = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public void adicionarProdutos() {

        Scanner sc = new Scanner(System.in);

        String continuar;

        do {

            System.out.print("Digite o valor do produto: ");
            double valorProduto = sc.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            setTotal(getTotal() + (valorProduto * quantidade));

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("s"));
    }

    public void dadosCliente() {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        System.out.print("Digite seu nome: ");
        setNome(sc.nextLine());

        System.out.print("Digite seu CPF: ");
        setCpf(sc.nextLine());

        System.out.print("Digite seu endereço: ");
        setEndereco(sc.nextLine());

        System.out.print("Forma de pagamento: ");
        setPagamento(sc.nextLine());
    }

    public void calcularFrete() {

        if (getTotal() > 500) {

            System.out.println("Frete grátis!");

        } else {

            setFrete(25);
            setTotal(getTotal() + getFrete());

            System.out.println("Frete de R$25 adicionado.");
        }

        System.out.println("Valor total: R$ " + getTotal());
    }

    public void finalizarCompra() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cartão aprovado? (s/n): ");
        String aprovado = sc.next();

        if (aprovado.equalsIgnoreCase("s")) {

            int numeroPedido;
            numeroPedido = (int) (Math.random() * 1000);

            System.out.println("Número do pedido: " + numeroPedido);

            System.out.println("Compra registrada.");
            System.out.println("Confirmação enviada.");
            System.out.println("Compra realizada com sucesso.");

        } else {

            System.out.println("Pagamento não autorizado.");
        }
    }
}