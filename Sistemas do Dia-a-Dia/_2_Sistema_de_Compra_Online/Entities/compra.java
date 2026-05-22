package _2_Sistema_de_Compra_Online.Entities;

import java.util.Scanner;

public class compra {

    String nome;
    String cpf;
    String endereco;
    String pagamento;

    double total = 0;
    double frete = 0;

    public void adicionarProdutos() {

        Scanner sc = new Scanner(System.in);

        String continuar;

        do {

            System.out.print("Digite o valor do produto: ");
            double valorProduto = sc.nextDouble();

            System.out.print("Digite a quantidade: ");
            int quantidade = sc.nextInt();

            total = total + (valorProduto * quantidade);

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("s"));
    }

    public void dadosCliente() {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        cpf = sc.nextLine();

        System.out.print("Digite seu endereço: ");
        endereco = sc.nextLine();

        System.out.print("Forma de pagamento: ");
        pagamento = sc.nextLine();
    }

    public void calcularFrete() {

        if (total > 500) {

            System.out.println("Frete grátis!");

        } else {

            frete = 25;
            total = total + frete;

            System.out.println("Frete de R$25 adicionado.");
        }

        System.out.println("Valor total: R$ " + total);
    }

    public void finalizarCompra() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cartão aprovado? (s/n): ");
        String aprovado = sc.next();

        if (aprovado.equalsIgnoreCase("s")) {

            int numeroPedido;

            numeroPedido = (int)(Math.random() * 1000);

            System.out.println("Número do pedido: " + numeroPedido);

            System.out.println("Compra registrada.");
            System.out.println("Confirmação enviada.");
            System.out.println("Compra realizada com sucesso.");

        } else {

            System.out.println("Pagamento não autorizado.");
        }
    }
}