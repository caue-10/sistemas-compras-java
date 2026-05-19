package loja;

public class PagamentoCartaoCredito extends ProcessadorPagamento {

    @Override
    public boolean processarPagamento(double valor) {

        System.out.println("Pagamento via cartão aprovado.");

        return true;
    }
}