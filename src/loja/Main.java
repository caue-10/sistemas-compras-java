package loja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA DE COMPRAS =====");

        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Digite o telefone: ");
        String telefone = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf, telefone);

        System.out.println("\nEscolha um produto:");
        System.out.println("1 - Notebook Dell - R$ 3500,00");
        System.out.println("2 - Camiseta Nike - R$ 120,00");

        int opcaoProduto = sc.nextInt();
        sc.nextLine();

        Produto produto;

        if (opcaoProduto == 1) {

            produto = new ProdutoEletronico(
                    "001",
                    3500.00,
                    "Notebook Dell",
                    "Dell"
            );

        } else {

            produto = new ProdutoVestuario(
                    "002",
                    120.00,
                    "Camiseta Nike",
                    "M"
            );
        }

        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - PIX");
        System.out.println("2 - Cartão");
        System.out.println("3 - Boleto");

        int opcaoPagamento = sc.nextInt();

        ProcessadorPagamento pagamento;

        if (opcaoPagamento == 1) {
            pagamento = new PagamentoPix();
            if (opcaoPagamento == 2)
                pagamento = new PagamentoCartaoCredito();
        }else{
            pagamento = new PagamentoBoleto();;
        }

        Compra compra = new Compra(
                cliente,
                produto,
                pagamento
        );

        System.out.println("\n===== DADOS DA COMPRA =====");

        compra.realizarCompra();

        System.out.println("\n===== DADOS DO CLIENTE =====");

        cliente.exibirDadosCliente();

        sc.close();
    }
}