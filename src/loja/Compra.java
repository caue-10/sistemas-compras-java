package loja;

public class Compra {

    private Cliente cliente;
    private Produto produto;
    private ProcessadorPagamento pagamento;

    public Compra(Cliente cliente, Produto produto, ProcessadorPagamento pagamento) {
        this.cliente = cliente;
        this.produto = produto;
        this.pagamento = pagamento;
    }

    public void realizarCompra() {

        System.out.println("Produto: " + produto.getNome());

        System.out.printf("Valor final: R$ %.2f%n", produto.getPrecoBase());

        pagamento.processarPagamento(produto.getPrecoBase());

        cliente.setSaldo(cliente.getSaldo() - produto.getPrecoBase());

        System.out.println("Compra realizada com sucesso!");

        System.out.printf("Saldo restante: R$ %.2f%n", cliente.getSaldo());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }
}